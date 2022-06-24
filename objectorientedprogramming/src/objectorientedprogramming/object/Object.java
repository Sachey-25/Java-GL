package objectorientedprogramming.object;

public class Object {
	// mention state and behavior 
	String name;
	int age;
	//constructor
	Object(String name, int age){
		//data can be stored i.e with the help of this operator
		// initialize the value which is given in the paramters.
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		
		//class name : Object
		// we will create an external object - state and behavior
		// Somebody who is required to store the data
		// -------> Constructor
		// Objects always created in the main method.
		Object a=new Object("Sachin Anil", 28);
		System.out.println(a.name);
		System.out.println(a.age);
	}
}