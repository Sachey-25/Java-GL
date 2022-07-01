package Javacollections_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sortingindecensing {

	public static void main(String[] args) {
		
		//Create an object for ArrayList
		ArrayList<String> countries=new ArrayList<String>();
		countries.add("Austria");
		countries.add("Belgium");
		countries.add("Denmark");
		countries.add("Czechia");
		countries.add("Estonia");
		
		/* Unsorted List:Array list content before sorting */
		System.out.println("************Before sorting***********");
		for(String display : countries) {			
			System.out.println("Countries of Europe : " + display);
		}
		
		// Sorting the elements of AL
		Collections.sort(countries);
		System.out.println("************Assending sort***********");
		for(String sort : countries) {			
			System.out.println("Countries of Europe : " + sort);
		}
		//De-sorting the elements of AL
		Collections.reverse(countries);				
		System.out.println("************Desending sort***********");
		for(String desend : countries) {
			System.out.println("Countries of Europe : " + desend);
		}	
	}
}