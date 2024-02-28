package org.jsp.springBeanLifeCycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestBeanLifeCycleByBeanFactory {
	public static void main(String[] args) {
		System.out.println("Testing Spring Bean LifeCycle by Bean Factory ");
		Resource r= new ClassPathResource("lifecycle.xml");
		BeanFactory f= new XmlBeanFactory(r);  //if we run here only the object is not initialized bcoz beanFactory is Lazy so we need to call getBean()
		System.out.println(f.getBean("student"));
		System.out.println(f.getBean("student"));//it gives same reference bcoz object is initialized only once
		System.out.println(f.getBean("student"));
		System.out.println(f.getBean("student"));
	}
}
