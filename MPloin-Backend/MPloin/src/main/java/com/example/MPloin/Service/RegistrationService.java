package com.example.MPloin.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.MPloin.DataModel.Team;
import com.example.MPloin.Repository.TeamRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private TeamRepository teamrepo;

	public ResponseEntity<Object> joinTeam (Long team_code){
		
		System.out.println(team_code);
		Optional<Team> teamDetails = teamrepo.findById(team_code);
		
		if(!teamDetails.isPresent())
			return ResponseEntity.notFound().build();
		else
			return ResponseEntity.status(HttpStatus.OK).body(teamDetails);
	}
	
}
