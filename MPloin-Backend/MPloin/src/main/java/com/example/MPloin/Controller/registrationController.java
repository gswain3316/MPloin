package com.example.MPloin.Controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.MPloin.DataModel.Employee;
import com.example.MPloin.Repository.EmplRepository;

@RestController
public class registrationController {

	@Autowired
	private EmplRepository empRepo ;
	
	@GetMapping("/test")
	public String test()
	{
		return "Test Controller !!";
	}
	
	@PostMapping("/register")
	public ResponseEntity<Object> registerConfirmed(@Valid @RequestBody Employee empl) throws Exception
	{
		Employee emp = empRepo.save(empl);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{company}").
				buildAndExpand(emp.getCompany()).toUri();
//		return "Registration is completed successfully !!";
		return ResponseEntity.created(location).build();
	}
	
}
