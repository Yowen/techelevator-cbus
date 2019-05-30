package com.techelevator;

public class Tank implements Vehicle{
	
	private String vehicleName = "Tank";
	
	@Override
	public double calculateToll(int distance) {
		return 0;
	}

	@Override
	public String getVehicleName() {
		// TODO Auto-generated method stub
		return vehicleName;
	}

}
