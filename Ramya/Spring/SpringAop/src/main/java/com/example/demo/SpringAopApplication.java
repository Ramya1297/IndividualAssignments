package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) {
		System.out.println("hi");
		SpringApplication.run(SpringAopApplication.class, args);
	}

}
