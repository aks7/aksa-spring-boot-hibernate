package com.aksa.group.aksa.springhibe.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import com.aksa.group.aksa.springhibe.controller.HibeController;
import com.aksa.group.aksa.springhibe.entity.Customer;
import com.aksa.group.aksa.springhibe.repository.CustomerRepository;
import com.aksa.group.aksa.springhibe.request.HibeRequest;

@ComponentScan
public class HibeImpl {
	private static final Logger LOGGER = LoggerFactory.getLogger(HibeController.class);

	@Autowired
	CustomerRepository repository;

	public String postCustomer(HibeRequest request) {
		
		if(null!=request && null !=request.getCustoemrList()) {
			
			for(Customer cust:request.getCustoemrList()) {
				
				repository.save(cust);
			}
		}

		LOGGER.debug("imple executed");

		return null;
	}

}
