package com.revature.oop;

import com.revature.exception.OutOfFuelException;

public abstract class Vehicle implements Comparable<Vehicle> {

	protected Integer yearMade;
	protected String manufacturer;

	public Vehicle(int yearMade, String manufacturer) {
		this.yearMade = yearMade;
		this.manufacturer = manufacturer;
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

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "Vehicle{" +
				"yearMade=" + yearMade +
				", manufacturer='" + manufacturer + '\'' +
				'}';
	}

	@Override
	public int compareTo(Vehicle vehicle) {
		return this.yearMade.compareTo(vehicle.getYearMade());
	}
}
