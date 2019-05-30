package com.techelevator;

public class Truck implements Vehicle {
	
	private int numberOfAxels;
	private String vehicleName = "Truck";
	
	public int getNumberOfAxels() {
		return numberOfAxels;
	}
	
	public Truck(int numberOfAxels) {
		this.numberOfAxels = numberOfAxels;
		this.vehicleName = "Truck (" + this.numberOfAxels + " axels)";
	}
	
	@Override
	public double calculateToll(int distance) {
		if (numberOfAxels == 4) {
			return distance * 0.040;
		}
		else if (numberOfAxels == 6) {
			return distance * 0.045;
		}
		else {
			return distance * 0.048;
		}
	}

	@Override
	public String getVehicleName() {
		// TODO Auto-generated method stub
		return vehicleName;
	}
}
