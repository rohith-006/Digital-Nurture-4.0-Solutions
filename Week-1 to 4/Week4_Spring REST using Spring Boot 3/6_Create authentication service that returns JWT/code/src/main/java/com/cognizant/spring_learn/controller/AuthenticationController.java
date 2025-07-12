package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.security.JwtUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AuthenticationController {

	@GetMapping("/authenticate")
	public ResponseEntity<?> authenticate(HttpServletRequest request) {
	    String authHeader = request.getHeader("Authorization");
	    System.out.println("Auth Header: " + authHeader); // debug

	    if (authHeader != null && authHeader.startsWith("Basic ")) {
	        String base64Credentials = authHeader.substring("Basic ".length());
	        byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
	        String credentials = new String(credDecoded);
	        System.out.println("Decoded credentials: " + credentials); // debug

	        String[] values = credentials.split(":", 2);
	        if (values.length < 2) {
	            return ResponseEntity.status(400).body("Malformed credentials");
	        }

	        String username = values[0];
	        String password = values[1];

	        if ("user".equals(username) && "pwd".equals(password)) {
	            String token = JwtUtil.generateToken(username);
	            return ResponseEntity.ok().body("{\"token\":\"" + token + "\"}");
	        } else {
	            System.out.println("Invalid credentials: " + username + " / " + password); // debug
	        }
	    } else {
	        System.out.println("Authorization header missing or not basic auth."); // debug
	    }

	    return ResponseEntity.status(401).body("Unauthorized");
	}
}

