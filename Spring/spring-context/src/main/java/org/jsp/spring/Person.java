package org.jsp.spring;

public class Person {
	private int age;
	private String name;
	
	public void display() {
		System.out.println("Age :"+age);
		System.out.println("Name :"+name);
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
