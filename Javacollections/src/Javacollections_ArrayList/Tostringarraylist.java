package Javacollections_ArrayList;

public class Tostringarraylist {
	
	//Class data members
	private int empid;
	private String empname;
	private String empdesig;
	private int empdesk;
	
	//Constructor to initialize the data-members
	public Tostringarraylist(int empid, String empname, String empdesig, int empdesk) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdesig = empdesig;
		this.empdesk = empdesk;
	}
	// Overriding the method to print the arrayList values
	@Override
	public String toString() {
		return " Employee [ empid=" + empid + ", "
				+ "empname=" + empname + ", "
						+ "empdesig=" + empdesig + ", "
								+ "empdesk=" + empdesk + "]";
	}
}