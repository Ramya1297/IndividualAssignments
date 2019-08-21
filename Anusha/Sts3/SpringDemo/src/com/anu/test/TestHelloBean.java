package com.anu.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import com.anu.beans.HelloBean;

public class TestHelloBean {

	public static void main(String args[])
	{
		BeanFactory factory =new XmlBeanFactory(new ClassPathResource("hellobean.xml"));
		HelloBean b1=(HelloBean) factory.getBean("bean1");
		HelloBean b2=(HelloBean) factory.getBean("bean1");
		System.out.println(b1==b2);
			b1.sayHello();
			
				
	}
}
