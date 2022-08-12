package org.globallogic.os.api.common;

import org.globallogic.os.api.entity.Order;

public class Transactionresponse {
	
	private Order order;
	private double amount; // 8999.00
	private String transactionId; // order Id --- Random
	private String message;
	
	public Transactionresponse(Order order, double amount, String transactionId, String message) {
		super();
		this.order = order;
		this.amount = amount;
		this.transactionId = transactionId;
		this.message = message;
	}

	public Transactionresponse() {
		super();
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}