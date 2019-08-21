package com.rt;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory; 
import org.springframework.core.io.ClassPathResource; 
public class HelloWorldDemo {
public static void main(String args[]) {
	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("Bean.xml"));
	HelloWorld h=(HelloWorld) factory.getBean("myBeanId");
	h.sayHello();
}
}
