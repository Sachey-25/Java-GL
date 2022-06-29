package objectorientedprogramming.object;

public class Constructors {
	String name;
	String firstname;
	String lastname;
	int age;
	int pincode;
	boolean value=true;
	//Constructor () : Nothing : Default constructor
	//No parameter constructor.
	Constructors(String name,String firstname){
		this.name="Sachin";
		this.firstname="Sachin";
		this.lastname="Anil";
		this.age=28;
		this.pincode=585415;
		this.value=true;
	}
	public static void main(String[] args) {
		/* Constructor is a block of code initialize 
		 * newly created object A constructor resembles an instance
		 * method in java  but it's not a method as it doesn't have a return type.
		 * In short constructor and methods are different. 
		 */
		/* How constructor works
		 * 
		 * To understand the working of constructor, 
		 * 
		 * MyClass object = new MyClass();
		 * The new keyword here creates the object of class myClass() and invokes
		 * the constructor to initialize(store) this newly created object.
		 */
		Constructors object = new Constructors("" , "");
		System.out.println(object.name);
		System.out.println(object.firstname);
		System.out.println(object.lastname);
		System.out.println(object.age);
		System.out.println(object.pincode);
		System.out.println(object.value);
	}
}
