package Inheritance;

//Example 1
//How to use super keyword to access variables of parent class

class Baseclass{
	//Data member || Variable
	int number=10;
}

public class Superclass extends Baseclass{
	/*
	 * Let's create a data member (variable) as same as super class data member
	 * which is already present in the superclass
	 */
	int number=110;
	//non static method
	void printNumber() {
		System.out.println("Parent data member: "+ (super.number));
		System.out.println("Subclass data member: "+ number);
	
	}

	public static void main(String[] args) {
		Superclass object=new Superclass();
		object.printNumber();

	}
}
