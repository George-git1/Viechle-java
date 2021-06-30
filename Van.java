package com.qa.helloworld;

public class Van extends Viechle {
	
	private String model;
	private String size;
	private int age;
	
	public Van(String size, String model) {
		this.model = model;
		this.size = size;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public float bill() {
		return (this.getAge() * this.getWheelNo());
	}
}
