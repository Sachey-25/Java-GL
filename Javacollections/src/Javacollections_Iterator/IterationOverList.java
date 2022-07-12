package Javacollections_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IterationOverList {

	public static void main(String[] args) {
		
		ListIterator<String> listiter=null; 
		
		List<String> MobilePhones=new ArrayList<String>();
		MobilePhones.add("iPhone");
		MobilePhones.add("oneplus");
		MobilePhones.add("Backberry");
		MobilePhones.add("MI");
		MobilePhones.add("Motorolla");
		
		//Obtaining list iterator
		listiter=MobilePhones.listIterator();
		
		System.out.println("Traversing the list in forward direction");
		while(listiter.hasNext()) {
			System.out.println(listiter.next());
		}
		System.out.println("Traversing the list in backword direction");
		while(listiter.hasPrevious()) {
			System.out.println(listiter.previous());
		}
	}
}