package Javacolections_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class JavacolectionsLinkedList {

	public static void main(String[] args) {
		
		//Creating an object for LinkedList
		LinkedList<String> list=new LinkedList<String>();		
		list.add("Sachin");
		list.add("Java");
		list.add("Programming");
		
		//steps involved to make JVM understand what node is what, like first and last
		// Adding an element to the first possition
		list.addFirst("LinkedList"); // head
		//Adding an element to the last position
		list.addLast("Pointer");
		//If we want any elements between head and tail
		list.add(3, "Learning");

		//Iterate through the values
		// We need to create an object for the iterator.
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}