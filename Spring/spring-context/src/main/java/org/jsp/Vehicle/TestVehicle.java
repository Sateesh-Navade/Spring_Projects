package org.jsp.Vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestVehicle {
	public static void main(String[] args) {
		ApplicationContext c= new ClassPathXmlApplicationContext("ride.xml");
		Ride r= c.getBean("ride",Ride.class);
		r.getV().Start();
	}
}
