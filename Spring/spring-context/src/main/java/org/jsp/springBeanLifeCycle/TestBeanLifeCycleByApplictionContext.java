package org.jsp.springBeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanLifeCycleByApplictionContext {
	public static void main(String[] args) {
		System.out.println("Testing Spring Bean lifeCycle By Application Context");
		ApplicationContext c=new ClassPathXmlApplicationContext("lifecycle.xml");
		System.out.println(c.getBean("student"));
		System.out.println(c.getBean("student"));
		System.out.println(c.getBean("student"));
		System.out.println(c.getBean("student"));
		((ClassPathXmlApplicationContext)c).close();
	}
}
