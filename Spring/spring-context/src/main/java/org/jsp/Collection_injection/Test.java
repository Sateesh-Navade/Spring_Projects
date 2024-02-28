package org.jsp.Collection_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext c= new ClassPathXmlApplicationContext("dept.xml");
		Department d= c.getBean("dept",Department.class);
		System.out.println("Names : "+d.getNames());
		System.out.println("ID's : "+d.getIds());
		System.out.println("Details : "+d.getDetails());
	}
}
