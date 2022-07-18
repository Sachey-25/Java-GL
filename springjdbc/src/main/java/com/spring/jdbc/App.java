package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
    	/*
    	 * Spring JDBC
    	 * insert operation
    	 * >> best way of performing the db operation (Industry pattern)
    	 */
        System.out.println( "My program started...!" );
        //Spring JDBC --> jdbc template =-====> implementation code
        ApplicationContext context=
        		new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        // we need to say Hi to the jdbcTemplate ==== database operation.
//        JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert query
//        String query="insert into student (id, name,city) values(?,?,?)";
        
//        //fire query
//        int result=template.update(query,101,"ArtificalIntelligence","Bangalore");
//        System.out.println("Number of record inserted..!" + result);
//        
//        //close the IoC
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class );
        Student student = new Student();
        student.setId(456);
        student.setName("DaoArchitecture");
        student.setCity("Mumbai");
        
        int display=studentDao.insert(student);
        System.out.println("Student record inserted.." +display);
        
        ((ClassPathXmlApplicationContext) context).close();
        
    }
}