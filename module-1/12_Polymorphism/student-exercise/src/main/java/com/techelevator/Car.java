package com.techelevator;

public class Car implements Vehicle {
	private boolean hasTrailer;
	private String vehicleName = "Car";

	public boolean isHasTrailer() {
		return hasTrailer;
	}
	
	public String getVehicleName() {
		return vehicleName;
	}

	public Car(boolean hasTrailer) {
		if (hasTrailer == true) {
			this.hasTrailer = hasTrailer;
			this.vehicleName = "Car (with trailer)";
		}
		else {
			this.vehicleName = "Car";
		}
	}

	@Override
	public double calculateToll(int distance) {
		if (hasTrailer == true) {
			return (distance * 0.020) + 1.00;
		}
		else {
			return distance * 0.020;
		}
	}
}
