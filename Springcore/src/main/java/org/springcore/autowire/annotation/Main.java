package org.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=
				new ClassPathXmlApplicationContext
				("org/springcore/autowire/annotation/autoconfig.xml");
		
		Emp emp=context.getBean("emp",Emp.class);
		System.out.println(emp);
		AnotherExample anotherExample=context
				.getBean("AnotherExample", AnotherExample.class);
		System.out.println(anotherExample);
		((ClassPathXmlApplicationContext) context).close();

	}
}