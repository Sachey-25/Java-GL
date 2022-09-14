package org.bct.spring.jdbc.dao;

import java.util.List;

import org.bct.spring.jdbc.Student;

public interface StudentDao {
	
	public int insert(Student student); //abstract method to insert 
	public int change(Student student); //abstract method to update
	public int delete(int studentId); //Delete 
	public Student getStudent(int studentId); //Get
	
	//All the record present in the db
	public List<Student> getAlStudents();

}
