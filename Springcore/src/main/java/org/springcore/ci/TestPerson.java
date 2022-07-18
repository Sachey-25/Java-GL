package org.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/springcore/ci/Configperson.xml");
		
		Person person=(Person)context.getBean("person");
		System.out.println(person);
	}
}
/*< Application context is the root configuration for every web application>
< Spring loads application context.xml and creates the applicationContext for whole
application

xml, beans == Output || Values entire applicationContext is the object IoC loads
objects throughout the application --- ApplicationContext > */