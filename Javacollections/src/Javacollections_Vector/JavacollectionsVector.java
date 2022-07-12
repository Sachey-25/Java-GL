package Javacollections_Vector;

import java.util.Vector;

public class JavacollectionsVector {

	public static void main(String[] args) {
		
		//Vector
		Vector<String> fruits=new Vector<String>(2,6);
		
		// Adding elements to the vector
		fruits.addElement("Apple");
		fruits.addElement("Mango");
		fruits.addElement("Kiwi");
		fruits.addElement("Orange");
		fruits.addElement("Strawberry");
		fruits.addElement("Grapes");	
		
		//Check the size of the vector
		System.out.println("Size is: " + fruits.size());
		//Check the capacity of the vector
		System.out.println("Default capacity of vector:" +fruits.capacity());
	}
}