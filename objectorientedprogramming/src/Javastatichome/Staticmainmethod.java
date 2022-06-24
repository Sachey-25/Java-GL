package Javastatichome;

public class Staticmainmethod {
	// Static main method is accessing static variables
	// without creating object.
	
	static int num=100;
	static String name="Programming is fun";
	static String code="Java Programming";
	static float pi=3.142f;
	
	//Static method accessed directly in static and non-static methods
	//static method
	static void display() {
		System.out.println("This statement belong to static method");
		System.out.println("This statement belong to static method");
		System.out.println("This statement belong to static method");
		System.out.println("This statement belong to static method");
	}
	//non-static method
	void fun() {
		System.out.println("This is from non-static method");
		System.out.println("Calling the static method from here");
		System.out.println("==================");
		display();
	}
	public static void main(String[] args) {

		System.out.println("Accessed the static varibales without an object");
		System.out.println(num);
		System.out.println(name);
		System.out.println(code);
		System.out.println(pi);
		System.out.println("==================");
		
		Staticmainmethod object=new Staticmainmethod();
		object.fun();
	}
}