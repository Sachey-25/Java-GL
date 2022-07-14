package org.student.manage;
//Java POJO file -- data, table, any information -- database.
public class Student {
	private int studentId;
	private String studentName;
	private String studentPhone;
	private String studentCity;
	
	//Constructor
	public Student(int studentId, String studentName, String studentPhone, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}

	public Student(String studentName, String studentPhone, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}
	
	public Student(){
		
	}
	//I need an encapsulation -- getter and setter methods.
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
	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	
	
	// Display the result
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + 
				", studentName=" + studentName + 
				", studentPhone=" + studentPhone
				+ ", studentCity=" + studentCity + "]";
	}
}
