package com.revature.oop;

public class Truckski extends Vehicle implements Steerable {

	public Truckski() {
		super();
	}

	public Truckski(int yearMade) {
		super();
		this.yearMade = yearMade;
	}
	
	@Override
	public void go() {
		System.out.println("Truckski is going!");
	}

	@Override
	public String toString() {
		return "Truckski [yearMade=" + yearMade + "]";
	}

	@Override
	public void turnLeft() {
		System.out.println("Turn truckski handlebars CCW");
	}

	@Override
	public void turnRight() {
		System.out.println("Turn truckski handlebars CW");
	}
	
}
