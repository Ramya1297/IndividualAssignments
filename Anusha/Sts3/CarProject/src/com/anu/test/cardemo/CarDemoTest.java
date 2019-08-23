package com.anu.test.cardemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.anu.assign.cardemo.Car;
import com.anu.assign.cardemo.Sedan;

public class CarDemoTest {
	public static void main(String args[]) {
	BeanFactory factory =new XmlBeanFactory(new ClassPathResource("carparentbean.xml"));
	Car c1=(Car) factory.getBean("mycar");
	c1.show();
	Sedan s1=(Sedan) factory.getBean("sedancar");
	s1.display();
	
Car c2=(Car) factory.getBean("othercar");
c2.show();
	Car c3=(Car) factory.getBean("newcar");
	c3.show();
	}
}
