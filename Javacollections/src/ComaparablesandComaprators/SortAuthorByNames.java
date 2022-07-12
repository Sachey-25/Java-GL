package ComaparablesandComaprators;

import java.util.ArrayList;
import java.util.Collections;

public class SortAuthorByNames {

	public static void main(String[] args) {
		//List of objects of Author class
		ArrayList<Author> al=new ArrayList<Author>();
		al.add(new Author("Henry", "Miller", "Tropic of Cancer"));
		al.add(new Author("Chetan","Bhagat","Half Girlfriend"));
		al.add(new Author("Sachin","Anil","Sachin's Autobigraphy"));
		al.add(new Author("Frank","Miller","300"));
		al.add(new Author("Chetan","Bhagat","2 states"));
		/*
		 * Sorting the list using Collections.sort(); we can use this method
		 * because we implemented comparable interface in our 
		 * defined class Author
		 */
		Collections.sort(al);
		for(Author display:al ) {
			System.out.println(display.firstname +  " " + display.lastname + " " 
					+ "Book:" + display.bookname);
		}
		System.out.println("====================================================");
		for(Author display:al ) {
			System.out.println(display.firstname +  " " + display.bookname + " " 
					+ "lastname:" + display.lastname);
		}
		
	}
}
