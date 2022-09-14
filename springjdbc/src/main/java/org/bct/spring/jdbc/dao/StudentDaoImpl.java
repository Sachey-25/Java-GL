package org.bct.spring.jdbc.dao;

import java.util.List;

import org.bct.spring.jdbc.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImpl implements StudentDao {
	
	//we need to call the jdbcTemplate class --- Jdbc template class has already been
	// developed for db operations.
	
	// insert, update, delete , select
	
	//DI - JdbcTemplate
	private JdbcTemplate jdbcTemplate;  // DB operations
	
	//Insert method 
	public int insert(Student student) {
		
	   //insert query
       String query="insert into student(id,name,city) values(?,?,?)";
        
       int insert = this.jdbcTemplate.update(query, 
        		student.getId(), student.getName(),student.getCity());
		return insert;
	}
	
	
	//Update method
	public int change(Student student) {
		String query="update student set name=? , city=? where id=?";
		int change=this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return change;
	}
	
	//delete Method
	public int delete(int studentId) {
		//delete the data
		String query="delete from student where id=?";
		int delete=this.jdbcTemplate.update(query, studentId);
		return delete;
	}
	
	public Student getStudent(int studentId) {
		//Select single student data
		String query="Select * from student where id=?";
		RowMapper<Student> rowmapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowmapper, studentId);
		
		return student;
	}
	
	public List<Student> getAlStudents() {
		//Selecting multiple records
		String query="Select * from student";
		List<Student> students=this.jdbcTemplate.query(query, new org.bct.spring.jdbc.dao.RowMapperImpl());
		return students;
	}



	private ResultSetExtractor RowMapperImpl() {
		// TODO Auto-generated method stub
		return null;
	}


	//Getters and seters to JdbcTemplate to inteact with the DB operations
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	//getters and setters
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
