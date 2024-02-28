package org.jsp.autowireing;

public class Car {
	private Engine engine;

	public Car() {
		System.out.println("Car() is Called");
	}

	public Car(Engine engine) {
		this.engine = engine;
		System.out.println("Car(Engine) is Called");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
}
