package com.revature.generic;

import java.util.ArrayList;

import com.revature.oop.Car;
import com.revature.oop.ChargingRhino;
import com.revature.oop.Truckski;
import com.revature.oop.Vehicle;

public class GenericTrawl {

	public GenericTrawl() {
		// TODO Auto-generated constructor stub
	}
	
	public static ArrayList<Vehicle> trawl(ArrayList<Vehicle> things) {
		ArrayList<Vehicle> returnList = new ArrayList<Vehicle>();
		
		for (Vehicle v : things) {
			try {
				if (v.getClass() ==  Class.forName("com.revature.oop.Car")) {
					returnList.add(v);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		return returnList;
	}
	
	public static <T> ArrayList<Car> betterTrawl(ArrayList<T> things, String classType) {
		
		ArrayList<Car> returnList = new ArrayList<Car>();
		
		for (T item : things) {
			try {
				if (item.getClass() == Class.forName(classType)) {
					returnList.add((Car)item);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		return returnList;
	}

	public static void main(String[] args) {
		Car c1 = new Car(1956, 13);
		Car c2 = new Car(2001, 95);
		Truckski t1 = new Truckski(1956);
		Car c3 = new Car(2651, 1000);
		Truckski t2 = new Truckski(1754);
		Truckski t3 = new Truckski(1845);
		ChargingRhino cr1 = new ChargingRhino();
		
		ArrayList<Vehicle> testList = new ArrayList<Vehicle>();
		
		testList.add(c1);
		testList.add(t1);
		testList.add(c2);
		testList.add(c3);
		testList.add(t2);
		testList.add(t3);
		testList.add(cr1);
		
		System.out.println(betterTrawl(testList, "com.revature.oop.Car"));
	}

}
