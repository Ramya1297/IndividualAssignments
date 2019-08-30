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
	
@Value("${user.uname}")
private String name;
@Value("22")
private int age;
@Value("America")
private String destination;
@Autowired
private Address address;
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
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
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", destination=" + destination + ", address=" + address + "]";
}

}
