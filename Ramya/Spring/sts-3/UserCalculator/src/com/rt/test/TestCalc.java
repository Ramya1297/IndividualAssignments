package com.rt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.rt.*;

public class TestCalc {
	public static void main(String args[]) {
		
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("bean.xml"));
		User user=(User) factory.getBean("myBeanId");
		user.Addition(3,6);
	}
}