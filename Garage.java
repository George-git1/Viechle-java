package com.qa.helloworld;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	List<Viechle> garage;

	public Garage() {
		garage = new ArrayList<Viechle>();

	}

	public void add(Viechle viechle) {
		garage.add(viechle);
	}

	public void remove(int id) {
		if (id < garage.size()) {
			garage.remove(id);
		}
	}

	public void remove(String type) {
		for (int i = 0; i < garage.size(); i++) {
			if (garage.get(i).getType().equals(type)) {
				garage.remove(i--);
			}
		}
	}

	public void clear() {
		garage.clear();
		System.out.println("Garage has been cleared");
	}

	public float fix(int index) {
		return garage.get(index).bill();
	}

	public void bills() {
		for (Viechle viechle : garage) {
			System.out.println(viechle.bill());

		}
	}
}