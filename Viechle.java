package com.qa.helloworld;

public class Viechle {
	
	private String name;
	private String type;
	private int wheelNo;
	private int topSpeed;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	public float bill() {
		return (float) this.wheelNo * this.topSpeed;
	}
	

}
