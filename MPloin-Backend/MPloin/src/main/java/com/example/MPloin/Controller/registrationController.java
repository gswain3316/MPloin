package com.example.MPloin.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class registrationController {

	@GetMapping("/register")
	public String registerConfirmed()
	{
		return "Registration is completed successfully !!";
	}
	
}
