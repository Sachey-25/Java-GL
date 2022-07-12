package ExceptionHandlingIntro;

import java.io.IOException;
//User defined exceptions -- Inheritance operations

public class ExampleOFthrowKeyword {
	
	//method
	static void checkEligibility(int age, int weight) throws IOException {
		if(weight<12 && age<40) {
			throw new IOException("Student is not eligible for registration");
		}else {
			System.out.println("Student entry invalid");
		}
	}
	static void checkString(String name) throws IOException {
		if(name=="Sachin") {
			throw new IOException("String is valid");
		}
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to the Registration Process");
		//call the method
		checkEligibility(39,10);
		checkString("Sachin");
		try {
			System.out.println("Starting of try block");
			// I'm, throwing the custom exception
			throw new MyException("This is my error message");
		}
		catch(MyException e) {
			System.out.println("Catch Block");
			System.out.println();
		}
	}
}