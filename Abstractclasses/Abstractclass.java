package Abstractclasses;

abstract class Animal{
	//Normal method
	public void display(int a) {
		
	}
	//Abstract method
	public abstract void disp(); // function call
	
	String animal="Lion";
}
class Lion extends Animal{
	
	//overrides -- the abstract method present in the class
	public void disp() {
		System.out.println( animal + ": is the king of the forest" );
	}
}
public class Abstractclass {

	public static void main(String[] args) {
		Animal object = new Lion(); // Abstraction 
		object.disp();
	}
}