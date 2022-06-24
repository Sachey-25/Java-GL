package Javamethods;

public class Javamethods {
	
	public static void findEvenOdd(int num) {
		if(num%2==0) {
			System.out.println(num + ": it is even");
		}else {
			System.out.println(num + ": it is Odd");
		}
	}
	public void findEvenorNo(int num) {
		if(num%2==0) {
			System.out.println(num + ": it is even");
		}else {
			System.out.println(num + ": it is Odd");
		}
	}
	public static void main(String[] args) {
		/* in general a method is a way to perform some task.
		 * similarly, the method in java is collection of instructions that 
		 * performs specific task. it provides the re usability of code.
		 * We can also modify code using methods. 
		 * 
		 * What is method, types of methods, methods declarations and
		 * how to call the method.
		 */
		//Method declaration. access specifier, return type, method name
		// method parameters
		
		// Access specifiers : 4 types of AS
		/* 1. public : The method is accessible || watchable by all classes when we use
		 * public specifier in out application.
		 * 
		 * 2. private: When we use private access specifier, the method is 
		 * accessible only in the classes which it is defined.
		 * 
		 * 3. protected : When we use a protected access specifier the method  is
		 * accessible within the same package or subclasses in a different package.
		 * 4. default : When we do not use any access specifier in the method declaration
		 * java uses default access specifier by default.
		 * it is visible only from the same package.
		 * 
		 * 
		 * 
		 * 
		 * Naming conventions
		 * -------------------
		 * while defining a method -- method name is must be a verb and start with 
		 * lower-case.
		 * handleChangeUsername
		 * 
		 * Types of methods
		 * 1. predefined Method
		 * 2. User-defined Method
		 * 
		 */
		System.out.println("The maximum number is : " + Math.max(5, 10));
		//Method call
		findEvenOdd(10);
		Javamethods object = new Javamethods();
		object.findEvenorNo(5);
	}
}
