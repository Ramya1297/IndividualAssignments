package com.example.demo;

import org.springframework.stereotype.Component;

public class User {

private String uname; //must match with that in login.jsp
private String upass;
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpass() {
	return upass;
}
public void setUpass(String upass) {
	this.upass = upass;
}

}
