package com.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.model.Admin;
import com.application.repository.AdminRepository;
import com.application.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin findAdminByEmailAndPassword(String email, String Password) {
		Admin admin = adminRepository.findByEmailAndPassword(email, Password);
		return admin;
	}

}
