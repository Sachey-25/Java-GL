package Javacollections_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) {
		//Create an object to the AL
		ArrayList<String>colors=new ArrayList<String>();
		
		//Adding the elements
		colors.add("White");
		colors.add("Orange");
		colors.add("Red");
		colors.add("Indigo");
		colors.add("Purple");
		
		System.out.println("Before sorting...");
		for(String sort : colors) {
			System.out.println("ArrayList elements of colors: " +sort);
		}
		
		//Sorting the elements into ascending order		
		Collections.sort(colors);
		System.out.println("-----------After sorting------------------------");
		
		//for loop
		for(String sort : colors) {
			System.out.println("ArrayList elements of colors: " +sort);
		}
	}
}
