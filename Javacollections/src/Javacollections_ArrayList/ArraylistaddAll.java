package Javacollections_ArrayList;

import java.util.ArrayList;

public class ArraylistaddAll {

	public static void main(String[] args) {
		ArrayList<String>colors=new ArrayList<String>();
		
		//Adding the elements
		colors.add("White");
		colors.add("Orange");
		colors.add("Red");
		colors.add("Indigo");
		colors.add("Purple");
		System.out.println("ArrayList before adAll" + colors);
		
		ArrayList<String> countries=new ArrayList<String>();
		countries.add("Austria");
		countries.add("Belgium");
		countries.add("Denmark");
		countries.add("Czechia");
		countries.add("Estonia");
		System.out.println("ArrayList before adAll" + countries);
		
		colors.addAll(countries);
		System.out.println(colors);  
		
	}
}