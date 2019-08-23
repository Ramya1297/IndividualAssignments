package com.anu.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.anu.beans.HelloConstructor;

public class TestConstructorBean {
	public static void main(String args[])
	{
		BeanFactory factory =new XmlBeanFactory(new ClassPathResource("constructorbean.xml"));
		HelloConstructor b1= (HelloConstructor) factory.getBean("bean2");
			b1.sayHi();

}
}