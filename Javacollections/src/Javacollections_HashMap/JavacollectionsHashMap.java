package Javacollections_HashMap;

import java.util.HashMap;

public class JavacollectionsHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String>hmap=new HashMap<Integer, String>();
		//adding the elements to HashMap
		hmap.put(12, "Lion");
		hmap.put(8, "Tiger");
		hmap.put(49,"Deer");
		hmap.put(4, "Wolf");
		hmap.put(18, "Rabbit");
		
		//Display the elements of the HashMap
		System.out.println(hmap);
		//If wanted to access any element
		System.out.println("Second element of HashMap: " + hmap.get(8));
		System.out.println("Third element of HashMap: " + hmap.get(49));
		System.out.println("Fourth element of HashMap: " + hmap.get(4));
		System.out.println("Fifth element of HashMap: " + hmap.get(18));
		System.out.println("First element of HashMap: " + hmap.get(12));
	}
}
