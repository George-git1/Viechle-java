package com.qa.helloworld;

public class Motrorcycle extends Viechle{
	
	private String model;
	private String make;
	private int age;
	
	public Motrorcycle(String model, String make) {
		this.model = model;
		this.make = make;
	}
		
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public float bill() {
		return (this.getWheelNo() * this.getAge());
	}
}
