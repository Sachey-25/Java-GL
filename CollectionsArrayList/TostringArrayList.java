package CollectionsArrayList;

import java.util.ArrayList;

import Javacollections_ArrayList.Tostringarraylist;

public class TostringArrayList {

	public static void main(String[] args) {
		
		//Creating an object to the array list
		
		ArrayList<Tostringarraylist> arrayList=new ArrayList<Tostringarraylist>();
		arrayList.add(new Tostringarraylist(101, "Sachin", "TechnicalTead", 2));
		arrayList.add(new Tostringarraylist(102, "Rahul", "SoftwareDeveloper", 3));
		arrayList.add(new Tostringarraylist(103, "Sourav", "DevOpsEngineer", 4));
		
		//loop to all the elements of the array.
		for(Tostringarraylist display:arrayList ) {
			System.out.println(display);
		}
	}
}