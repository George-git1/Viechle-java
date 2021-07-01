package com.qa.helloworld;

public class Runnerv {

	public static void main(String[] args) {
		
		Car car = new Car("Ford", "S");
		Viechle viechle = new Viechle("BMW", 4, 150);
		Garage garage = new Garage();
		garage.add(new Car("Merc", "s"));
		garage.add(new Van("Big", "ford"));
		garage.add(new Motrorcycle("BMW", "A"));
		garage.bills();
		System.out.println("Van 2: " + garage.fix(0) + "\nCar 1: " + garage.fix(1));
		garage.bills();
		garage.clear();
		garage.remove("Van");
		viechle.boost();
		car.handbrakeTurn();
		
		
	}
}
