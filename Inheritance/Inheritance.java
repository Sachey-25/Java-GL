package Inheritance;

class Technical extends Inheritance{
	String subject="Java Programming";
}

// name the parent class = main class 
// name the subclass  = derived class
// name the object of = logic

public class Inheritance {
	
	//data members
	String designation="Trainer";
	String institute="SkillBout";
	
	//Method - non static method
	void display() {
		System.out.println("Training");
		// Check the number is even or not
	}
	void print() {
		System.out.println("Training");
		// Check the number even or odd in the first 20 numbers
	}
	void show() {
		System.out.println("Training");
		//check and find the largest number number out three
	}
	void does() {
		System.out.println("Training");
		//Check that the person is eligible to vote.
	}

	public static void main(String[] args) {
		// inheritance --- we need to create an object to the subclass
		Technical object = new Technical();
		System.out.println(object.institute);
		System.out.println(object.designation);
		System.out.println(object.subject);
		object.does();
	}
}
