package objectorientedprogramming.object;

public class Parameterizedconstructor {
	
	int empid;
	String empfname;
	String emplastname;
	String empdesig;
	int empdesk;
	String location;
	int pincode;
	
	//Parameterized constructor
	public Parameterizedconstructor(int empid, String empfname, 
			String emplastname, String empdesig, int empdesk,
			String location, int pincode) {
		super();
		this.empid = empid;
		this.empfname = empfname;
		this.emplastname = emplastname;
		this.empdesig = empdesig;
		this.empdesk = empdesk;
		this.location = location;
		this.pincode = pincode;
	}
		
	public static void main(String[] args) {
		//creating an object
		Parameterizedconstructor empdetails=new Parameterizedconstructor(101,"Sachin","Anil",
				"Technical Team",3,"Bangalore",560045);
		System.out.println("Employee deatils are : ");
		System.out.println("empId:" + empdetails.empid);
		System.out.println("empfirstname:"+ empdetails.empfname);
		System.out.println("emplastname:"+empdetails.emplastname);
		System.out.println("empdesignation:"+empdetails.empdesig);
		System.out.println("empdesk:"+empdetails.empdesk);
		
	}
}