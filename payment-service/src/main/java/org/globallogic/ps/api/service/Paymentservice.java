package org.globallogic.ps.api.service;

import java.util.Random;
import java.util.UUID;

import org.globallogic.ps.api.entity.Payment;
import org.globallogic.ps.api.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Paymentservice {
	
	@Autowired
	private PaymentRepository repository;
	
	//Where I am making the payment
	public Payment doPayment(Payment payment) {
		
		//calling the server via method to check if payment is success
		payment.setPaymentStatus(paymentProcessing());
		
		payment.setTransactionId(UUID.randomUUID().toString()); // Bank-server
		return repository.save(payment);
	}

	public String paymentProcessing() {
		//api should be 3rd party gateway (paytm, phonepay, googlepay,)
		return new Random().nextBoolean() ? "success":"false";
	}

	public Payment findPaymentHistoryByOrderId(int orderId) {
		
		return repository.findByOrderId(orderId);
	}
}