package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        		new AnnotationConfigApplicationContext(JdbcConfig.class);
        // we need to say Hi to the jdbcTemplate ==== database operation.
//        JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert query
//        String query="insert into student (id, name,city) values(?,?,?)";
        
//        //fire query
//        int result=template.update(query,101,"ArtificalIntelligence","Bangalore");
//        System.out.println("Number of record inserted..!" + result);
//        
//        
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class );
        //INSERT
//        Student student = new Student();
//        student.setId(200);
//        student.setName("JavaBackend");
//        student.setCity("Kolkatta");
//        int insert=studentDao.insert(student);
//        System.out.println("Student record inserted : " + insert);
//        System.out.println("==================================");
//        
//        //UPDATE
//        student.setId(333);
//        student.setName("DBoperation - Crud");
//        student.setCity("Hydrabad");
//        int update=studentDao.change(student);
//        System.out.println("Data changed : " + update);
//        System.out.println("==================================");
//        
//        //DELETE
//        int result=studentDao.delete(222);
//        System.out.println("deleted : " + result );
        
        
        
//        Student student=studentDao.getStudent(200);
//        System.out.println(student);
        
        List<Student> students = studentDao.getAllStudents();
        for(Student display: students) {
        	System.out.println(display);
        }
        
        //close the IoC
       ((AnnotationConfigApplicationContext) context).close();
        
    }
}