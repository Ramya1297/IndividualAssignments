package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
private int eid;
	private int age;
private String designation;
private String name;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", age=" + age + ", designation=" + designation + ", name=" + name + "]";
}

}
