package org.jsp.springBeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean {
	private String name;
	
	static {
		System.out.println("Student Class Loaded Into JVM Memory");
	}
	
	public Student() {
		System.out.println("Student Instantiated");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void destroy() throws Exception {
		System.out.println("Student Destroyed");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Student Initialized");
	}
}
