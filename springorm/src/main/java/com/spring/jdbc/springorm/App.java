package com.spring.jdbc.springorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
//        Student student=new Student(2526,"SpringORM","Mumbai");
//        int r=studentDao.insert(student);
//        System.out.println("done record inserted : " + r);  
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean go=true;
        while(go) {
            System.out.println("PRESS 1 FOR add new student");
            System.out.println("PRESS 2 FOR display allstudents");
            System.out.println("PRESS 3 FOR get details for single student");
            System.out.println("PRESS 4 FOR delete student");
            System.out.println("PRESS 5 FOR update student");
            System.out.println("PRESS 6 FOR for exit");
            try {
            	int input=Integer.parseInt(br.readLine());

            	switch(input) {
            	case 1:
            		//add a new student // dynamic inputs
            		System.out.println("Enter userId: ");
            		int uId=Integer.parseInt(br.readLine());
            		System.out.println("Enter user name: ");
            		String uName=br.readLine();
            		System.out.println("Enter user city: ");
            		String ucity=br.readLine();
            		
            		//Creating student object and setting values
            		Student st=new Student();
            		st.setStudentId(uId);
            		st.setStudentName(uName);
            		st.setStudentCity(ucity);
            		
            		//Saving student to databse by calling insert of student dao
            		int r=studentDao.insert(st);
            		System.out.println(r + "student added");
            		System.out.println("*******************************************");
            		System.out.println();
            		
            		
            		break;
            	case 2:
            		//display all student
            		List<Student> allStudents=studentDao.getAllStudents();
            		for(Student obj:allStudents) {
            			System.out.println("Id" +obj.getStudentId());
            			System.out.println("Name" +obj.getStudentName());
            			System.out.println("City" +obj.getStudentCity());
            			System.out.println("________________________________________");
            		}
            		break;
            	case 3:
            		//get single student data
            		System.out.println("Enter user Id : ");
            		int userId=Integer.parseInt(br.readLine());
            		Student student= studentDao.getStudent(userId);
        			System.out.println("Id : " + student.getStudentId());
        			System.out.println("Name : " +student.getStudentName());
        			System.out.println("City: " +student.getStudentCity());
        			System.out.println("________________________________________");
            		
            		break;
            	case 4:
            		//delete student
            		System.out.println("Enter user Id:");
            		int id=Integer.parseInt(br.readLine());
            		studentDao.deleteStudent(id);
            		System.out.println("Student record deleted.");
            		break;
            	case 5:
            		//update  student
            		//studentDao.updateStudent(student);
            		break;
            	case 6:
            		//exit the program
            		go=false;
            		break;
            	}
            }catch(Exception e) {
            	System.out.println("Invalid Input Try with another one !!!");
            	System.out.println(e.getMessage());
            }
        }

        System.out.println("Thank you for using my application");
        System.out.println("See you again!");
        
        ((ClassPathXmlApplicationContext) context).close();
    }
}