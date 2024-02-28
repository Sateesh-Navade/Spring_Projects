package org.jsp.springBeanLifeCycle;

public class Demo {
	static {
		System.out.println("DEMO Class Is Loaded into JVM Memory");
	}
	public Demo() {
		System.out.println("DEMO INSTANTIATED");
	}
	public void hii() {
		System.out.println("DEMO INITIALIZED");
	}
	public void byee() {
		System.out.println("DEMO DESTROYED");
	}
}
