package org.globallogic.os.api.service;

import org.globallogic.os.api.common.Payment;
import org.globallogic.os.api.common.Transactionrequest;
import org.globallogic.os.api.common.Transactionresponse;
import org.globallogic.os.api.entity.Order;
import org.globallogic.os.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Orderservice {
	
	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private RestTemplate template;
	
	public Transactionresponse saveOrder(Transactionrequest request) {
		String response="";
		Order order=request.getOrder();
		Payment payment=request.getPayment();
		payment.setOrderId(order.getId()); // id==id
		payment.setAmount(order.getPrice());// amount==price
		
		//Rest call
		Payment paymentResponse=template.postForObject
				//Api call to bank
				("http://PAYMENT-SERVICE/payment/doPayment", payment, Payment.class);
		
		response=paymentResponse.getPaymentStatus().equals("success")?
				"payment processing successful and order placed"
				:"payment processing successful and order placed.";
		repository.save(order);
		return new Transactionresponse(order,paymentResponse.getAmount(),
				paymentResponse.getTransactionId(), response);
	}
}
