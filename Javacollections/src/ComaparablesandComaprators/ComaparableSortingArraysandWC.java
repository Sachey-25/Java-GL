package ComaparablesandComaprators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComaparableSortingArraysandWC {

	public static void main(String[] args) {
		/*
		 * Integer class implements Comparable 
		 * Interface so we can use the sort method.
		 */
		//Creating an array
		int[] arr= {11,55,34,22,0,89};
		//Array sort
		Arrays.sort(arr);
		System.out.println("Sorted Int Array: "+ arr);
		System.out.println(Arrays.toString(arr));
		/*
		 * String class implements Comparable 
		 * Interface so we use sort method
		 */
		System.out.println("--------------------------------------");
		String [] names= {"Bangalore","Hydrabad","Mumbai"};
		Arrays.sort(names);
		System.out.println("Sorted Arrays string " + names);
		System.out.println(Arrays.toString(names));
		
		/*
		 * String class implements Comparable 
		 * Interface so we can use the sort method
		 * List
		 */
		//creating the array list object
		List<String> colors=new ArrayList<String>();
		
		colors.add("Orange");
		colors.add("White");
		colors.add("Purple");
		colors.add("Indigo");
		
		Collections.sort(colors);
		System.out.println("ArrayList elements: ");
		for(String sorted:colors) {
			System.out.println("Sorted elements : " + sorted);
		}
		

	}
}