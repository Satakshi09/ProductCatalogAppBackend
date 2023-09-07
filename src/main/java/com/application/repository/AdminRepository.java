package com.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {
	public Admin findByEmailAndPassword(String email, String password);
}
