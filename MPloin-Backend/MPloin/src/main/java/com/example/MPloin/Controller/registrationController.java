package com.example.MPloin.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MPloin.DataModel.Employee;

@RestController
public class registrationController {

	@GetMapping("/test")
	public String test()
	{
		return "Test Controller !!";
	}
	
	@PostMapping("/register")
	public String registerConfirmed(@RequestBody Employee empl)
	{
		
		return "Registration is completed successfully !!";
	}
	
}
