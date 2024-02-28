package org.jsp.springBeanLifeCycle;

public class Test {
	static {
		System.out.println("Test Class Is Loaded into JVM Memory");
	}
	public Test() {
		System.out.println("Test INSTANTIATED");
	}
	public void hii() {
		System.out.println("Test INITIALIZED");
	}
	public void byee() {
		System.out.println("Test DESTROYED");
	}
}
