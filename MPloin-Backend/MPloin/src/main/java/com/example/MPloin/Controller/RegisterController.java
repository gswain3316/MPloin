package com.example.MPloin.Controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.MPloin.DataModel.Employee;
import com.example.MPloin.DataModel.Team;
import com.example.MPloin.Repository.EmplRepository;
import com.example.MPloin.Repository.TeamRepository;
import com.example.MPloin.Service.RegistrationService;

@RestController
public class RegisterController {

	@Autowired
	private EmplRepository empRepo ;
	
	@Autowired
	private TeamRepository teamRepo;
	
	@Autowired
	private RegistrationService registerServ;
	
	
	@GetMapping("/test")
	public String test()
	{
		empRepo.save(new Employee("Gaurav", "gswain3316@gmail.com", "qwerty@123", "Male"));
		return "Test Controller !!";
	}
	
	@GetMapping("/joinTeam")
	public ResponseEntity<Object> joinTeam(@RequestParam Long team_code)
	{
		return registerServ.joinTeam(team_code);
	}
	
	@PostMapping("/registerEmployee")
	public ResponseEntity<Object> registeremployee (@Valid @RequestBody Employee empl) throws Exception
	{
		Employee emp = empRepo.save(empl);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{empl_email}").
				buildAndExpand(emp.getEmpl_email()).toUri();
//		return "Registration is completed successfully !!";
		return ResponseEntity.created(location).build();
	}
	
	@PostMapping("/registerTeam")
	public ResponseEntity<Object> registerTeam (@Valid @RequestBody Team team) throws Exception
	{
		Team new_team = teamRepo.save(team);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{team_code}")
				.buildAndExpand(new_team.getTeam_code()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	
	  @PutMapping("/registerPassword") 
	  public String registerPassword(@RequestParam String empl_email, @RequestParam String empl_password) throws Exception 
	  {
		  ResponseEntity<Object> result = registerServ.registerPassword(empl_email, empl_password); 
		  if(result.getStatusCode()==HttpStatus.OK) 
			  return "Password successfully saved !!"; 
		  else 
		  	return "Error, Password not saved. TRY AGAIN !!"; 
	  }
	 
	
	  
}
