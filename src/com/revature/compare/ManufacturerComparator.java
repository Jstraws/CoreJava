package com.revature.compare;

import com.revature.oop.Vehicle;

import java.util.Comparator;

public class ManufacturerComparator implements Comparator<Vehicle> {

    public ManufacturerComparator() {

    }

    @Override
    public int compare(Vehicle vehicle, Vehicle t1) {
        return vehicle.getManufacturer().compareTo(t1.getManufacturer());
    }
}
