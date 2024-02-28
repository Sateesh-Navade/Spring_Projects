package org.jsp.springannotationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestComponent {
	
	public static void main(String[] args) {
		ApplicationContext c=new AnnotationConfigApplicationContext("org.jsp.springannotationdemo");
		Test t=c.getBean(Test.class);
		t.test();
	}
}
