package org.GlobalLogic.Springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     // create and configure beans  --- injection 
        ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
        //Dependency Injection - mechanism
        
        // left side student is the name of the class
        // same-wise as we know constructor name should be as same as class name
        // hence we consider the right side class name - Student is type casted as 
        // Constructor. 
        Student stuObject=(Student) context.getBean("student");
        Student stuObj=(Student) context.getBean("studentone");
        Student stuObje=(Student) context.getBean("studenttwo");
        
        System.out.println(stuObject);
        System.out.println(stuObj);
        System.out.println(stuObje);
    }
}