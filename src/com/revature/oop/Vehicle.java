package com.revature.oop;

import com.revature.exception.OutOfFuelException;

public abstract class Vehicle {

	protected int yearMade;
	
	public Vehicle(int yearMade) {
		super();
		this.yearMade = yearMade;
	}
	
	public Vehicle() {
		super();
	}
	
	public abstract void go() throws OutOfFuelException;

	public int getYearMade() {
		return yearMade;
	}

	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}

	@Override
	public String toString() {
		return "Vehicle [yearMade=" + yearMade + "]";
	}

}
