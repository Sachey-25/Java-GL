package org.bct.spring.jdbc;

import java.util.List;

import org.bct.spring.jdbc.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("My program started...........");
        // spring jdbc ----> jdbctemplate
        ApplicationContext context=
        		new ClassPathXmlApplicationContext("org/bct/spring/jdbc/config.xml");
                
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
        //Insert to the data table - springjdbcOne
//        Student studentob=new Student();
//        studentob.setId(101);
//        studentob.setName("New UnknownStudent");
//        studentob.setCity("SomeWhere On the Earth");
        
//        int result=studentDao.insert(studentob);
//        System.out.println("Student record added " + result);
        
        // for an update-- data table - springjdbcOne -- we need to focus the primary 
//        studentob.setId(107);
//        studentob.setName("New name to student");
//        studentob.setCity("Indore");
//        int update=studentDao.change(studentob);
//        System.out.println("Data is been updated "+update);
        
        
        //Delete a record from the data table - springjdbcOne
        int delete=studentDao.delete(107);
        System.out.println("Record deleted " + delete);
        
        //Get the single data
        Student student=studentDao.getStudent(666);
        System.out.println(student);
        System.out.println("------------------------------------------");
        
        List<Student> students = studentDao.getAlStudents();
        for(Student display : students) {
        	System.out.println(display);
        }
        
        ((AnnotationConfigApplicationContext) context).close();
        
    }
}