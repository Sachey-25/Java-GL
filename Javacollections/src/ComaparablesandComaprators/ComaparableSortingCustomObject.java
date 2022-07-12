package ComaparablesandComaprators;

//
//public abstract int compareTo(Test object ) {
//	
//}
//

class Author implements Comparable<Author>{
	//Class data members
	String firstname;
	String lastname;
	String bookname;

	//Constructor
	Author(String firstname,String lastname, String bookname){
		//Initialize the object values
		this.firstname=firstname;
		this.lastname=lastname;  //object ????
		this.bookname=bookname;
	}
	/* 
	 * This is where we write the logic to sort. This method sorts automatically
	 * by the first name in case that the last name is the same
	 */
	@Override
	public int compareTo(Author o) {
		/*
		 * Sorting the last name. compareTo should return<0 if this(keyword)
		 * is supported to be less than or > or equal to 0.
		 * Acceding order 
		 *  0 ... 1 ... 2... 3... 4
		 *  -4...-3....-2...-1....0
		 */
		int last=this.lastname.compareTo(o.lastname);
		
		//Ternary operator
		return last==0 ? this.firstname.compareTo(o.firstname) : last;
	}
}

public class ComaparableSortingCustomObject {

}
