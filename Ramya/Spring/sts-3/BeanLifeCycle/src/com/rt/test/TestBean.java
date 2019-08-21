package com.rt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.rt.Bean;

public class TestBean {
	public static void main(String args[]) {
	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("Bean.xml"));
	Bean bean=(Bean) factory.getBean("myBean");
	System.out.print("from method invoke"+bean.getCounter());
}
}
