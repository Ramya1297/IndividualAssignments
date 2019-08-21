package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addr")
public class Address {
	@Value("Telangana")
private String State;
	@Value("520003")
private int pin;
	@Value("Hyderabad")
private String City;
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}

@Override
public String toString() {
	return "Address [State=" + State + ", pin=" + pin + ", City=" + City + "]";
}
}
