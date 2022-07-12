package Javacollections_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Javaqueue {

	public static void main(String[] args) {
		//Creating an object to the Queue
		Queue<String> names=new LinkedList<String>();
		
		//Adding the elements to the Queue
		names.add("Athira"); // 0
		names.add("Joseph"); // 1
		names.add("Sachin"); // 2
		names.add("Java"); // 3
		names.add("Programming"); // 4
		
		System.out.println("Elements of Queue: " + names);
		// we can use of remove() method
		/* We can remove element from Queue using remove() 
		 * this would remove the first element from the Queue.
		 */
		System.out.println("Removed element is : " + names.remove());
		/*
		 * element() method - this returns the head of the Queue 
		 * is the first element
		 */
		System.out.println("Head element: " + names.element());
		/* poll(), peek()
		 * -- this removes and returns the head of the Queue
		 * Returns null if the queue is empty 
		 */
		System.out.println("Poll() : " + names.poll());
		/* -- peek()
		 * -- it works as element() - however it returns null
		 * if the queue is empty
		 */
		System.out.println("Peek(): " + names.peek());
	}
}