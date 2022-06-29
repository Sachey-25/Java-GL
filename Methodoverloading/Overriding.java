package Methodoverloading;
/* 
 * When we declare the same method(equal) in child class which is already
 * present in parent class then this is called method overriding.
*/
class Parentclass{
	//Parent class constructors
	Parentclass(){
		System.out.println("Constructor of parent class");
	}
	//non static method
	void disp() {
		System.out.println("Parent Method");
	}
}
public class Overriding extends Parentclass {
	//Sub class constructor
	Overriding(){
		System.out.println("Constructor of child class");
	}
	void disp() {
		System.out.println("Child Method");
		System.out.println("-------------------");
		super.disp(); // super keyword copies the parent properties
	}

	public static void main(String[] args) {
		Overriding obj=new Overriding();
		obj.disp();
	}
}