package Javamethods;

public class Recursion {
	/* Syntax:
		 * --------
		 * returntype methodname(){
		 * 	// code to be executed
		 * }
		 * methodname();
		 */
	// Recursion for infinite times
	static int count=0;
	public static void display() {
		count++; 
		if(count<=5) {
			System.out.println("Hello : this will print finite");
			display();
		}
	} // factorial number, fabinacci numbers , statics calculation
	// Data interpretation, Data analytics
	
	// n(n-1) ! // 5 =====> 5 * (5-4) * (5-3) * (5-2) * (5-1)
	// -------------------> 5*4*3*2*1 == 120 result
	public static int factorial(int number) {
		if(number==1) { 
			return 1;
		}else {
			return (number*factorial(number-1));	// 5! = 5*4*3*2*1
			//any number! = any number * anynumber-1
		}
	}
	public static void main(String[] args) {
		/*
		 * Recursion in java is a process in which a method calls itself
		 * continuously. A method in java that calls itself is called 
		 * recursive method
		 * 
		 */	
		//Invoke method
		System.out.println("factorial of 5 is : " + factorial(5));
		display();
		}
}