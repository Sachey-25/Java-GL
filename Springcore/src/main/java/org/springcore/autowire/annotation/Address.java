package org.springcore.autowire.annotation;

public class Address {
	private String street;
	private String city;
	
	//Parameterized constructor 
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	
	//Getter and setter method implementation
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	//Default constructor	
	public Address() {
		super();
	}
	
	//To display the values
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
}