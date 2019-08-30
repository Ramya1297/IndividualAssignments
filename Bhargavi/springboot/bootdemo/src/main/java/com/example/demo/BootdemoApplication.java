package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootdemoApplication {

	public static void main(String[] args) {
		Employee e1=SpringApplication.run(BootdemoApplication.class, args).getBean(Employee.class);
		System.out.println(e1);

	}

}
