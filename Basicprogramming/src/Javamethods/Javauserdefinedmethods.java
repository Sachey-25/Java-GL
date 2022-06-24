package Javamethods;

import java.util.*;

public class Javauserdefinedmethods {
	
	public static void findEvenOdd(int num) {
		if(num%2==0) {
			System.out.println(num + ": is even");
		}else
			System.out.println(num + ": is odd");
	}
	public int addNumbers(int numone, int numtwo) {
		int sum = numone+numtwo;
		System.out.println("addition of two numbers are : " + sum);
		return sum;
	}
	
	public static int square(int num) {
		return num*num;
	}
	
	public void display() {
		System.out.println("Method without parameter.");
		System.out.println("Method without return keyword since it has void");
	}
	

	public static void main(String[] args) {
		int result;
		// creating a scanner class object
		Scanner ins = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num=ins.nextInt();
		findEvenOdd(num);
		
		System.out.println("Enter first number");
		int numone = ins.nextInt();
		System.out.println("Enter second number");
		int numtwo = ins.nextInt();
		ins.close();
						
		Javauserdefinedmethods object = new Javauserdefinedmethods();
		object.addNumbers(numone, numtwo); //Method call
		
		result = square(10); // Method invoke
		System.out.println("Sqaure of number 10 is : " + result);
		 
		object.display(); // Method invoke
	}
}

