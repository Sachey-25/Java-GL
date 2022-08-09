package org.globallogic.os.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_TB")

public class Order {
	
	@Id
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="qty")
	private int qty;
	@Column(name="price")
	private double price;
	
	public Order(int id, String name, int qty, double price) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	public Order() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}