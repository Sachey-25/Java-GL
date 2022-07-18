package SoringFramework;

import SpringFrameworkone.Intelligent;

public class Sachin {
	Intelligent intelligent;  //DI
	
	public void displaySomething() {
		System.out.println("This is an live exmaple of Dependency Injection of IoC");
	}
	public static void main(String[] args) {
		Sachin object=new Sachin();
		object.displaySomething();
	}
}