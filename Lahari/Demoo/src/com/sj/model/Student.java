package com.sj.model;

public class Student {
	String name;
	int rollno;
	String course;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", course=" + course + "]";
	}
	public void printName()
	{
		System.out.println("Name"+name);
		
	}
	
	public void printCourse()
	{
		System.out.println("Course"+course);
		
	}
	public void printRollono()
	{
		System.out.println("Rollno"+rollno);
		
	}
	
	public void printThrowException() {
		throw new IllegalArgumentException();
	}
}
