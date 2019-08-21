package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootDemoApplication {

	public static void main(String[] args) {
		//Employee e= (Employee) SpringApplication.run(BootDemoApplication.class, args).getBean(Employee.class);
		//ApplicationContext context=SpringApplication.run(BootDemoApplication.class,args);
		ApplicationContext context=SpringApplication.run(BootDemoApplication.class,args);
		//Employee e=context.getBean(Employee.class);
		//Employee e1=(Employee) context.getBean("emp");
		//Employee e2=(Employee) context.getBean("emp");
		Employee e3=(Employee) context.getBean("emp");
	
		//System.out.println(e1.hashCode());
		//System.out.println(e2.hashCode());
		System.out.println(e3);
	}

}
