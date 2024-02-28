package org.jsp.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestCar {
	public static void main(String[] args) {
		
		
		Resource r=new ClassPathResource("car.xml");
		
		BeanFactory f=new XmlBeanFactory(r);
		
		Car c=(Car)f.getBean("mycar");
		c.start();
		
		Car c1=f.getBean(Car.class);
		Car c2=f.getBean("mycar", Car.class);
		
	}
}
