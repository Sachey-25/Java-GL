package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entites.Student;

public interface StudentDao {
	public int insert(Student student); //id, name. city
	
	public int change(Student student); //id, name, city
	
	public int delete(int studentId); //id
	
	public Student getStudent(int studentId);
	
	//list -- for loop 
	public List<Student> getAllStudents();
}