package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")
@Scope("prototype")
@PropertySource("myresources.properties")
public class Employee {
	@Value("${uname.t}")
	private String name;
	@Value("21")
	private int age;
	@Value("50000")
	private double salary;
	@Value("TA")
	private String designation;
	@Autowired
	Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
		
	}
	@Override
	public String toString() {
		System.out.println( "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", designation=" + designation+ "]");
		System.out.println(address);
		return "";
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	

}
