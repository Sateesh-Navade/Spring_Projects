package org.jsp.Collection_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryMain {
	public static void main(String[] args) {
		ApplicationContext c= new ClassPathXmlApplicationContext("library.xml");
		Library l=c.getBean("lib",Library.class);
		System.out.println("Avalible Book Details :"+l.getDetails());
		System.out.println("Books :"+l.getBooks());
		System.out.println("Authors :"+l.getAuthor ());
	}
}
