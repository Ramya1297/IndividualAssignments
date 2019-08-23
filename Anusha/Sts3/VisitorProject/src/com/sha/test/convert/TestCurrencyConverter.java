package com.sha.test.convert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sha.curconvert.Visitor;

public class TestCurrencyConverter {
	public static void main(String args[]) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("vistorbean.xml");

	     Visitor user = (Visitor) context.getBean("myBeanID");
	  user.getConversion(4990.0);
	}

}
