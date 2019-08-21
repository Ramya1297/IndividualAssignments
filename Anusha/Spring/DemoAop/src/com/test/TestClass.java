package com.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.aop.Student;

public class TestClass {

	public static void main(String args[])
	{
		XmlBeanFactory beanfactory=new  XmlBeanFactory(new ClassPathResource("aop1.xml"));
	//ApplicationContext beanfactory =new ClassPathXmlApplicationContext("aop1.xml");
		
		Student mybean=(Student) beanfactory.getBean("StudentProxy");	
		mybean.printName();
		mybean.printCourse();
		mybean.printRollno();
	//	mybean.printThrowsException();
	}
}
