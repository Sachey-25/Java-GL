package org.springcore.autowire.annotation;
import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	@Autowired
	private Address address;
	
	@Autowired
	private AnotherExample anotherExample;
	
	
	//Getter and setter method implementation
	public Address getAddress() {
		return address;
	}

	//Parameterized constructor
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor");
	}
	//Default constructor	
	public Emp() {
		super();
	}
	
	public void setAddress(Address address) {
		System.out.println("Setting value/address");
		this.address = address;
	}
	
	public AnotherExample getAnotherExample() {
		return anotherExample;
	}

	public void setAnotherExample(AnotherExample anotherExample) {
		this.anotherExample = anotherExample;
	}
	
	
	
	public Emp(AnotherExample anotherExample) {
		super();
		this.anotherExample = anotherExample;
		System.out.println("Inside constructor");
	}

	//To display the values
	@Override
	public String toString() {
		return "emp [address=" + address + "]";
	}
}
