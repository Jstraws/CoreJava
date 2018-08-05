package com.revature.oop;

import com.revature.exception.*;

public class Car extends Vehicle implements Steerable {
	
	private int tankPercentage;

	public Car(int yearMade, String manufacturer, int tankPercentage) {
		super(yearMade, manufacturer);
		this.tankPercentage = tankPercentage;
	}

	public Car() {}
	
	@Override
	public void go() throws OutOfFuelException {
		if(this.tankPercentage < 5) {
			throw new OutOfFuelException();
		} else {
			System.out.println("Car is vroom af");
		}
	}

	public int getTankPercentage() {
		return tankPercentage;
	}

	public void setTankPercentage(int tankPercentage) {
		this.tankPercentage = tankPercentage;
	}

	@Override
	public String toString() {
		return "Car{" +
				"tankPercentage=" + tankPercentage +
				", yearMade=" + yearMade +
				", manufacturer='" + manufacturer + '\'' +
				'}';
	}

	@Override
	public void turnLeft() {
		System.out.println("Car is turning left!");
	}

	@Override
	public void turnRight() {
		System.out.println("Car is turning right!");
	}
}
