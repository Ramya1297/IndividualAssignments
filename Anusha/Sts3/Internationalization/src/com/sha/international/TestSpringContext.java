package com.sha.international;

import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.cglib.core.Local;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringContext {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Locale locale = new Locale("en","INDIA");
        ResourceBundle mes = ResourceBundle.getBundle("messages",locale);
        
        
        System.out.println(mes.getString("msg.text"));
    }
}