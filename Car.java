package com.qa.helloworld;

public class Car extends Viechle {

	private String make;
	private String model;

	public Car(String make, String model) {
		super("Mercedes", 4, 300);
		this.model = make;
		this.make = model;

	}
	
	public void handbrakeTurn() {
		System.out.println( model + " Turns the corner at high speed with the handbrake");
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float bill() {
		return (this.getWheelNo() * this.getTopSpeed());
	}
}
