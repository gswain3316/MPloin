package com.example.MPloin.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.MPloin.DataModel.Employee;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JwtSecurityTokenGeneratorImpl implements SecurityTokenGenerator {
	
	@Override
	public Map<String, String> generateToken(Employee user) {
		String jwtToken = "";
		
		jwtToken = Jwts.builder().setSubject(user.getEmpl_email()).setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, "secretkey").compact();
		
		Map<String, String> map = new HashMap<>();
		map.put("token", jwtToken);
		map.put("message", "User successfully logged in");
		return map;
	}

}