package objectorientedprogramming.object;

public class Typesofconstructor {
	//There are 3 different types
	
	//1.Default constructor
	/*
	 * If do not implement any constructor in your class, Java compiler inserts
	 * a default constructor into your code on your behalf. this constructor
	 * is known as default constructor. 
	 * 
	 */
	//2.No-arg || no-Param's constructor
	/*
	 * Constructor with no arguments or no parameter is called no-arg or no-para
	 *   The signature is as same as default constructor.
	 *   however, body can be code unlike default constructor where body of the
	 *   constructor is empty
	 *   
	 */
	Typesofconstructor() {
		System.out.println("Default constructor");
	}
	public void myMethod() {
		System.out.println("Void method of the class");
	}
	//3.Parameterized constructor
	
	public static void main(String[] args) {
		System.out.println("Programming is fun");
		Typesofconstructor object = new Typesofconstructor();
		object.myMethod();		
	}
}
