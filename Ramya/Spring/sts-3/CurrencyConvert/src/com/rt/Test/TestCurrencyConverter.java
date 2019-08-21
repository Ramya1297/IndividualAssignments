package com.rt.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rt.*;

public class TestCurrencyConverter {
public static void main(String args[]) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

     User user = (User) context.getBean("myBeanID");
  user.getConversion(4900.0);
}
}
