package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(BootDemoApplication.class, args);
				Employee e	=(Employee) context.getBean("emp");
				
			    System.out.println(e);
			  
	
	}

}

