package objectorientedprogramming.object;

//Class - derived class 
class JavaExample extends Inheritancewithencap{
	String subject="Java OOP programming";
}

public class Inheritancewithencap {
	//Class data member
	protected String designation="Trainer";
	protected String institute="TechMasters";
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}	
//	//Class method-Getter and setter for designation data member
//	protected String getDesignation() {
//		return designation;
//	}
//	protected void setDesignation(String designation) {
//		this.designation=designation;		
//	}
//	//Class method-Getter and setter for institute data member
//	protected String getinstitute() {
//		return institute;
//	}
//	protected void setinstitute(String institute) {
//		this.institute=institute;		
//	}
	//non-static method
		void display() {
			System.out.println("Technical Training");
		}

	public static void main(String[] args) {
		//Created an object to the subclass (Inheritance)
		JavaExample object = new JavaExample();
		//data members of the class are accessed
		System.out.println("My designation is: "+object.designation);
		System.out.println("I work for : "+object.institute);
		System.out.println("I train on: "+object.subject);
		//Method invoke
		object.display();
	}
}