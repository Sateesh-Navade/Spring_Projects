package org.jsp.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestPerson {
	public static void main(String[] args) {
		Resource r= new ClassPathResource("car.xml");
		BeanFactory f= new XmlBeanFactory(r);
		Person p=(Person) f.getBean("person");
		p.display();
	}
}
