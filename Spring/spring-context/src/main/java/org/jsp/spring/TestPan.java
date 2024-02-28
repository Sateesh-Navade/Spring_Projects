package org.jsp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPan {
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("person-card.xml");
		Person1 p=c.getBean("person",Person1.class);
		p.getCard().display();
	}
}
