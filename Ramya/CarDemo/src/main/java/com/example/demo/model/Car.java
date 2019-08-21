package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {
@Id()
@GeneratedValue()
	int id;
String model;
int yearsOfUse;
String color;
double price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYearsOfUse() {
	return yearsOfUse;
}
public void setYearsOfUse(int yearsOfUse) {
	this.yearsOfUse = yearsOfUse;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Car [id=" + id + ", model=" + model + ", yearsOfUse=" + yearsOfUse + ", color=" + color + ", price=" + price
			+ "]";
}

}
