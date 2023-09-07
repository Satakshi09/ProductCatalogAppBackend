package com.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.exception.UserAlreadyPresentException;
import com.application.model.User;
import com.application.repository.UserRepository;
import com.application.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public void addUserRegistration(User userRegistration) {
		if (userRepository.findByEmail(userRegistration.getEmail()) == null)
			userRepository.save(userRegistration);
		else {

			throw new UserAlreadyPresentException("userRegistration", "email already present",
					userRegistration.getEmail());
		}

	}

	@Override
	public User findUserByEmailAndPassword(String email, String Password) {
		User user = userRepository.findByEmailAndPassword(email, Password);
		return user;
	}

}
