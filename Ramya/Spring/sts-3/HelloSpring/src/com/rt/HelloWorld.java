package com.rt;

public class HelloWorld {
String msg;

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}
public void sayHello() {
	System.out.println("Hellooo  "+msg);
}
}
