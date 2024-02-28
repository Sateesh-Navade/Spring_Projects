package org.jsp.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestUser {
	public static void main(String[] args) {
		Resource r= new ClassPathResource("user.xml");
		BeanFactory f= new XmlBeanFactory(r);
//		User u=(User) f.getBean("user");       //or
		User u= f.getBean("user",User.class);
		u.display();
	}
}
