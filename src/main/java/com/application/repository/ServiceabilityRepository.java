package com.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.model.Serviceability;

@Repository
public interface ServiceabilityRepository extends JpaRepository<Serviceability, Integer> {
	public Serviceability findByProductCodeAndPincode(String productCode, Integer Pincode);
}
