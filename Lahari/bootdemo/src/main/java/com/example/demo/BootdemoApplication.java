package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(BootdemoApplication.class, args);
		Employee e1 = (Employee) context.getBean("emp");
		Employee e2 = (Employee) context.getBean("emp");
		Employee e3 = (Employee) context.getBean("emp");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		System.out.println(e1);
	}

}
