package com.anu.beans;

public class HelloConstructor {
	String msg;

	public HelloConstructor(String msg) {
		super();
		this.msg = msg;
	}

	public HelloConstructor() {
		super();
		
	}
	public void sayHi() {
	
		System.out.println("hi anu to the spring");
	}
	
}
