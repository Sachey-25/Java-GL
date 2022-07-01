package Javacollections_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SublistofarrayList {

	public static void main(String[] args) {
		
		//Create an object for ArrayList
		ArrayList<String> languages=new ArrayList<String>();
		languages.add("Kannada");
		languages.add("Bengali");
		languages.add("Spanish");
		languages.add("Frensh");
		languages.add("Tamil");
		languages.add("Hindi");
		
		// Original ArrayList
		System.out.println("Original ArrayList" + languages);
		
		//Sublist to ArrayList
		ArrayList<String> language=new ArrayList<String>(languages.subList(1, 4));
		System.out.println("Sublist stored in OriginalList : " + language);
		
		//Sublist to List
		List<String> list=languages.subList(1, 4);
		System.out.println("Sublist stored in List: " + list);
		
		System.out.println("ArraylList contains the string 'Kannada' :  " +
								languages.contains("Kannada"));
		System.out.println("ArraylList contains the string 'Tamil' :  " +
				languages.contains("Tamil"));
		System.out.println("ArraylList contains the string 'Spanish' :  " +
				languages.contains("Spanish"));
		System.out.println("ArraylList contains the string 'Frensh' :  " +
				languages.contains("French"));

			
	}
}