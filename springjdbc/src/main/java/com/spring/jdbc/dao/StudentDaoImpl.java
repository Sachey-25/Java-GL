package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entites.Student;

public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//Override -- abstract from the interface -- display the inserted entities.
	public int insert(Student student) {
		//the insert sql query supported to executed here.
        //insert query
        String query="insert into student (id, name,city) values(?,?,?)";
        int r=this.jdbcTemplate.update(query,student.getId(),
        		student.getName(),student.getCity());
		return r;
	}

}