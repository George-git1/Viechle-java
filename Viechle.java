package com.qa.helloworld;

public class Viechle {

	private String type;
	private int wheelNo;
	private int topSpeed;

	public Viechle(String type, int wheelNo, int topSpeed) {
		this.wheelNo = wheelNo;
		this.topSpeed = topSpeed;
		this.type = type;
	}

	public void boost() {
		System.out.println("Activate " + type + " Boostttt");
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWheelNo() {
		return wheelNo;
	}

	public void setWheelNo(int wheelNo) {
		this.wheelNo = wheelNo;
	}
	
	public int getTopSpeed() {
		return this.topSpeed;
	}
	
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public float bill() {
		return (float) this.wheelNo * this.topSpeed;
	}

}
