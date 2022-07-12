package Javacollections_Queue;

import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		
		PriorityQueue<String> names=new PriorityQueue<String>();
		names.add("Sachin");
		names.add("Programming");
		names.add("Is");
		names.add("Fun");
		names.add("fun");
		names.add("Is");
		names.add("AA");
		names.add("BB");
		
		System.out.println("The head of this queue is the least element + "
				+ "with respect to the specified ordering");
		System.out.println("PriorityQueue is implemented :" + names);
	
	}
}