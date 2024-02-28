package org.jsp.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestNexon {
	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("myCar.xml");
		BeanFactory f=new XmlBeanFactory(r);
		Nexon c=f.getBean("nexon",Nexon.class);
		c.getMusicSystem().play();

		//		Car c1=f.getBean(Car.class);
		//		Car c2=f.getBean("mycar", Car.class);
	}
}
