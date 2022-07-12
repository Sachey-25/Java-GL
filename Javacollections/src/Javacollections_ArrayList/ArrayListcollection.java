package Javacollections_ArrayList;

import java.util.ArrayList;

//Array and ArrayList

// Array is the collection of same data type.
// int[5] array = [1,2,3,4,5]; // Fixed length, dynamic input is possible -- elements
// Adding and removing the elements/data is more expensive.
// array[4]=[1,2,3,4]

// In order to overcome the limitations of array the arrayList introduced.
// ArrayList is powered on dynamic memory allocation 
//-- since which AL can grow and shrink

// How to create AL : ArrayList<anyreturn type> ALName=new ArrayList<anyreturn type>();
public class ArrayListcollection {

	public static void main(String[] args) {
		//Lets create AL objects
		ArrayList<String> NameList=new ArrayList<String>();
		//How to add the data/elements ---- built method i.e, add()
		NameList.add("Sachin");
		NameList.add("Anil");
		NameList.add("Bangalore");
		NameList.add("Karnataka");
		NameList.add("585414");
		System.out.println("The elements of ArrayList are:" + NameList);
		//Adding an element in a particular position.
		NameList.add(3,"JavaDeveloper");
		System.out.println("----------------------------------------------");
		System.out.println("Added new element to the AL in pos 3 : " + NameList.get(3));
		
		System.out.println("Size of the AL: "+ NameList.size());
		System.out.println("Method of AL: "+ NameList.indexOf("Sachin") +"\n" + 
				NameList.lastIndexOf("Karnataka")+"\n"+NameList.remove(4) + "\n"+
				NameList.toString() +"\n"+ NameList.contains("Sachin") +"\n" +
				NameList.isEmpty() ); 	
	}
}