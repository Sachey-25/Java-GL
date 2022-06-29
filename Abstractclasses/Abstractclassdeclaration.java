package Abstractclasses;

abstract class A{
	//Abstract method is always placed in abstract class only.
	
	//Abstract method
	abstract void function(int a, String name, float digit, char ch);
	
	//regular method - concrete method with body.
	public void myMethod() {
		
	}
}
class Demo extends A{
	//Regular method but gets overridden on abstract method
	@Override
	public void function(int a,String name, float digit, char ch) {
		System.out.println("Overring the abstract method " + a);
		System.out.println("Overring the abstract method " + name);
		System.out.println("Overring the abstract method " + digit);
		System.out.println("Overring the abstract method " + ch);
	}
}

// since we override the methods every time 1. performance issue, 2. data loss
// abstraction will be 100% hiding the data. ---- interfaces 

public class Abstractclassdeclaration {

	public static void main(String[] args) {
		A object=new Demo();
		object.function(10,"Sachin A",3.142f,'D');
	}
}