package org.jsp.springBeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanLifeCycleByUsingDefault {
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("lifecycleDefaluts.xml");
		((ClassPathXmlApplicationContext)c).close();

	}
}
