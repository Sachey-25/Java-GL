package org.globallogic.os.api.controller;


import org.globallogic.os.api.common.Transactionrequest;
import org.globallogic.os.api.common.Transactionresponse;
import org.globallogic.os.api.service.Orderservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class Ordercontroller {
	
	@Autowired
	private Orderservice service;
	
	//Methods to do the crud operations
	//post
	
	@PostMapping("/bookOrder")
	public Transactionresponse bookOrder(@RequestBody Transactionrequest request) {
		return service.saveOrder(request);
	}	
}