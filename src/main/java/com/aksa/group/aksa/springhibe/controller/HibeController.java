package com.aksa.group.aksa.springhibe.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aksa.group.aksa.springhibe.impl.HibeImpl;
import com.aksa.group.aksa.springhibe.request.HibeRequest;

@RestController
//public class HibeController extends BaseExceptionController{
public class HibeController{
	@Autowired
	HibeImpl hibeImpl;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HibeController.class);
	
	@PostMapping("/hibe")
	String postData(@RequestBody HibeRequest req ) {
		LOGGER.debug("inside controller");
		
		hibeImpl.postCustomer(req);
		
		
		return "Success";
	}

}
