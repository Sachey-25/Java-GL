package Javacollections_HashMap;

import java.util.Enumeration;
import java.util.Hashtable;

public class Javacollections_Hashtable {

	
	public static void main(String[] args) {
		Enumeration<Integer> names;
		Integer key;
		
		Hashtable<Integer,String> hashtable=new Hashtable<Integer,String>();
		Hashtable<String,String> hashtableone=new Hashtable<String,String>();
		Hashtable<Integer,Integer> hashtabletwo=new Hashtable<Integer,Integer>();
		Hashtable<String,Integer> hashtablethree=new Hashtable<String,Integer>();
		
		//Hash-table will not allow either null keys or null values.
		hashtable.put(1, "Sachin");
		hashtable.put(45, "Rohit Sharma");
		hashtable.put(99, "Sourav Ganguly");
		hashtable.put(5, "Rahul Dravid");
		hashtable.put(7, "MS Dhoni");
		hashtable.put(37, "Ajay Jadeja");
		hashtable.put(6, "Sachin");
		hashtable.put(54, "Rohit Sharma");
		hashtable.put(87, "Sourav Ganguly");
		hashtable.put(53, "Rahul Dravid");
		hashtable.put(71, "MS Dhoni");
		hashtable.put(87, "Ajay Jadeja");
		// Print the elements of the hash table
		System.out.println("Elements of Hashtable: " );
		System.out.println(hashtable);
		//iterate the elements of the hash table
		
		names=hashtable.keys();
		while(names.hasMoreElements()) {
			key=names.nextElement();
			System.out.println("Key : " + key + " & Values : " + hashtable.get(key));
		}
		
	}
}
