package com.sha.international;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MessageClient {
	public static void main(String args[])
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("internationalbean");
		MessageSource msg;
		Locale l=new Locale("en","GB");
		//String str=msg.getMessage("welcome",);
		//System.out.println(str);
		
	}

}
