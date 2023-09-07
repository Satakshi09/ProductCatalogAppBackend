package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.User;
import com.application.service.UserService;

@CrossOrigin
@RestController
public class UserRegistrationController {
	@Autowired
	UserService userRegistrationService;

	/**
	 * User Registration
	 * 
	 * @param userRegistration
	 * @return
	 */
	@PostMapping("/registration")
	public ResponseEntity<Void> addUserRegistration(@RequestBody User userRegistration) {
		try {
			userRegistrationService.addUserRegistration(userRegistration);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.FOUND).build();
		}
	}
}
