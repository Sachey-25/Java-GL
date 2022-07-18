package org.GlobalLogic.Springcore;
//POJO ---> Constructors, setter and getter methods, method toString();
public class Student {
	//Data members - class Student  // properties ???? -- class student!!!
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	//Parameterized-Constructor - used to initialize the variables
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	//Encapsulation --- Setter and getter method.
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	//Default constructor - empty initialization
	public Student() {
		super();
	}
	//display the output -- list
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", "
				+ "studentName=" + studentName + ", "
						+ "studentAddress=" + studentAddress +"]";
		
	}
}