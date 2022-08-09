package org.globallogic.ps.api.controller;


import org.globallogic.ps.api.entity.Payment;
import org.globallogic.ps.api.service.Paymentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private Paymentservice service;
	
	
	//Methods to perform crud operations
	@PostMapping("/doPayment")
	public ResponseEntity<Payment> doPayment(@RequestBody Payment payment){
		return new ResponseEntity<Payment>(service.doPayment(payment), 
				HttpStatus.CREATED);
	}
	
	@GetMapping("/{orderId}")
	public Payment findPaymentHistoryByOrderId(@PathVariable int orderId) {
		return service.findPaymentHistoryByOrderId(orderId);
	}
	
}