package com.qa.helloworld;

public class Car extends Viechle {

	private String name;
	private String model;
	private int year;
	
	public Car(String name, String model) {
		this.model = model;
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public float bill() {
		return (this.getWheelNo() * this.getYear());
	}
}
