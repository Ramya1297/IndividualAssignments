package com.anu.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


import com.anu.calcy.User;

public class TestAddition {
	public static void main(String args[])
	
	
	{
		BeanFactory factory =new XmlBeanFactory(new ClassPathResource("caladd.xml"));
		User u1= (User) factory.getBean("addbean");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();	
		u1.addition(a,b);
			//System.out.println(u1.addition(3,4));
	}

}
