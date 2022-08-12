package org.globallogic.os.api.common;

import org.globallogic.os.api.entity.Order;

public class Transactionrequest {
	
	//Order -- Payment
	private Order order; // saved  -- id, name, qty, price
	private Payment payment; // saved -- id, status, t id
	
	public Transactionrequest(Order order, Payment payment) {
		super();
		this.order = order;
		this.payment = payment;
	}

	public Transactionrequest() {
		super();
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {   
		this.order = order;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

}
