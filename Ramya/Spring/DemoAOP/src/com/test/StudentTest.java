package com.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.rt.Student;

public class StudentTest {
public static void main(String args[])
{
	//XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("aop1.xml"));
	ApplicationContext context=new ClassPathXmlApplicationContext("aop1.xml");
	Student myBean =(Student) context.getBean("StudentProxy");
	myBean.printName();
	myBean.printCourse();
//	myBean.printThrowException();
}
}
