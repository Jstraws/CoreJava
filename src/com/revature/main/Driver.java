package com.revature.main;

import com.revature.exception.OutOfFuelException;
import com.revature.oop.*;
import java.util.*;

public class Driver {
	
	public static void main(String[] args) {
		funWithExceptions();
	}
	
	public static void funWithArrays() {
		int[] intArray1 = {3, 4, 5};
		
		System.out.println(Arrays.toString(intArray1));
	}
	
	public void funWithInheritance() {
		Truckski t = new Truckski();
		System.out.println(t.toString());
		
		t.setYearMade(1997);
		
		System.out.println(t.toString());
		
		t.go();
		
		t.turnLeft();
		t.turnRight();
		
		ChargingRhino cr = new ChargingRhino();
		
		cr.go();
	}

	public static void funWithExceptions() {
		Car c1 = new Car(1982, "", 40);
		Car c2 = new Car(2007, "", 3);
		
		try {
			c1.go();
			c2.go();
		} catch (OutOfFuelException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("This always runs");
		}
	}
	
}