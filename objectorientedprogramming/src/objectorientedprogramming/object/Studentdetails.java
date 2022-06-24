package objectorientedprogramming.object;

import java.util.*;

public class Studentdetails {
	//Student details - local variables, constructor, specified object 
	int sturollno;
	String stufirsname;
	String stulastname;
	String city;
	String state;
	int street;
	
	//Parameterized constructor		
	public Studentdetails(int sturollno, String stufirsname, 
			String stulastname, String city, String state,
			int street) {
		super();
		this.sturollno = sturollno;
		this.stufirsname = stufirsname;
		this.stulastname = stulastname;
		this.city = city;
		this.state = state;
		this.street = street;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter student rollno: ");
		int rollno=input.nextInt();
		input.nextLine();
		System.out.println("Enter student firstname:");
		String fname=input.nextLine();
		System.out.println("Enter student lastname:");
		String lname=input.nextLine();
		System.out.println("Enter student city:");
		String city=input.nextLine();
		System.out.println("Enter student state:");
		String state=input.nextLine();
		System.out.println("Enter student street:");
		int street=input.nextInt();
		System.out.println(
				"\n" + rollno 
				+"\n" + fname 
				+"\n" + lname
				+ "\n" + city 
				+ "\n" + state 
				+ "\n" + street   
				);
		input.close();
	}
}