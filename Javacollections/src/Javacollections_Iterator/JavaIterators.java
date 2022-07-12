package Javacollections_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterators {

	public static void main(String[] args) {
		ArrayList<String> collections=new ArrayList<String>();
		collections.add("ArrayList");
		collections.add("LinkedList");
		collections.add("Queue");
		collections.add("Dequeue");
		collections.add("PriorityQueue");
		
		Iterator<String> iter=collections.iterator();
		
		//we can avail increment/decrement using iter object
		while(iter.hasNext()) {
			/* hasNext() 
			 * we are trying to say that iter has some elements
			 */
			String object=(String) iter.next(); //going to next count
			System.out.println(object);
			
		}
	}
}