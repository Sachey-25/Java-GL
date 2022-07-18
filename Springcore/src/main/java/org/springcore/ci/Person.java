package org.springcore.ci;

public class Person {
	private int PanId;
	private String name;
	
	//Parameterized Constructor
	public Person(int panId, String name) {
		super();
		PanId = panId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [PanId=" + PanId + ", name=" + name + "]";
	}
}
