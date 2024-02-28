package org.jsp.spring;

public class User {
	private String name;
	private long phno;
	public User() {
	}
	public User(String name, long phno) {
		this.name = name;
		this.phno = phno;
	}
	
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Phno :"+phno);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
}
