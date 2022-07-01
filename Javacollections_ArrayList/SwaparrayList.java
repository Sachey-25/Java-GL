package Javacollections_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SwaparrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Sachin");
		al.add("Rahul");
		al.add("Sourav");
		al.add("Sunil");
		al.add("Kapil");
		al.add("Vinod");
		
		System.out.println("ArrayList before Swap");
		for(String swap:al) {
			System.out.println("Elements of al is : " +swap);
		}
		//Apply the swap : swapping 2nd index element with the 5th(index 4) element
		Collections.swap(al, 1, 4);
		System.out.println("ArrayList after Swap");
		for(String swap:al) {
			System.out.println("Elements iof al is : " + swap);
		}
	}
}