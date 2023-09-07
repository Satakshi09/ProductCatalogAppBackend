package com.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.model.Serviceability;
import com.application.repository.ServiceabilityRepository;
import com.application.service.ServiceabilityService;

@Service
public class ServiceabilityServiceImpl implements ServiceabilityService {

	@Autowired
	private ServiceabilityRepository serviceabilityRepository;

	@Override
	public void addServiceability(String productCode, Integer pincode, Integer expectedDeliveryTime) {
		serviceabilityRepository.save(new Serviceability(pincode, expectedDeliveryTime, productCode));
	}

	@Override
	public Serviceability findServiceabilityByProductCodeAndPincode(String productCode, Integer pincode) {
		Serviceability serviceability = serviceabilityRepository.findByProductCodeAndPincode(productCode, pincode);
		System.out.println(serviceability);
		return serviceability;

	}

}
