package Inheritance;

/* Aggregation is a special form of association. it is a relationship between
 * two classes like association, however its a directional association,
 * which means it is strictly a one way association. it represents a HAS-A relationship
 */

// Sachin -- has a home-address ??, has a mobilephone , has a watch, has a laptop 
class Address{
	int streetNum;
	int houseNum;
	String areaname;
	String landmark;
	String pin;
	String city;
	String state;
	
	Address(int street,int hn, String an, String lm, 
			String pin, String city, String state){
		//initialize the value to the data members
		this.streetNum=street;
		this.houseNum=hn;
		this.areaname=an;
		this.landmark=lm;
		this.pin=pin;
		this.city=city;
		this.state=state;
		
	}
}
// Student and I would like to display the student address.
public class Aggregation {
	
	int rollnum;
	String studentName;
	//Creating HAS-A relationship with the Address class  ||  student -----> address.
	Address studentAddr;

	// Constructor 
	Aggregation(int roll, String name,Address address){
		this.rollnum=roll;
		this.studentName=name;
		this.studentAddr=address;
	}
	public static void main(String[] args) {
		Address addr=new Address(43,9, "Dollar's colony",
				"Near to RailwayStattion","585414","Bidar","Karantaka");
		
		//We need to create an object to the aggregation class
		Aggregation object=new Aggregation(101,"Sachin A",addr);
		
		System.out.println(object.rollnum);
		System.out.println(object.studentName);
		System.out.println(object.studentAddr.streetNum);
		System.out.println(object.studentAddr.houseNum);
		System.out.println(object.studentAddr.areaname);
		System.out.println(object.studentAddr.pin);
		System.out.println(object.studentAddr.city);
		System.out.println(object.studentAddr.state);

	}
}