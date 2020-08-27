package com.example.MPloin.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.MPloin.DataModel.Employee;
import com.example.MPloin.DataModel.Team;
import com.example.MPloin.Repository.EmplRepository;
import com.example.MPloin.Repository.TeamRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private TeamRepository teamrepo;
	
	@Autowired
	private EmplRepository empRepo;

	public ResponseEntity<Object> joinTeam (Long team_code){
		
		Optional<Team> teamDetails = teamrepo.findById(team_code);
		
		if(!teamDetails.isPresent())
			return ResponseEntity.notFound().build();
		else
			return ResponseEntity.status(HttpStatus.OK).body(teamDetails);
	}
	
	public ResponseEntity<Object> registerPassword (String empl_email, String empl_password)
	{
		Optional<Employee> empDetails = empRepo.findById(empl_email);
		if(!empDetails.isPresent())
			return ResponseEntity.notFound().build();
		else {
			Employee emp = empDetails.get();
			emp.setEmpl_password(empl_password);
			empRepo.save(emp);
			}
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}