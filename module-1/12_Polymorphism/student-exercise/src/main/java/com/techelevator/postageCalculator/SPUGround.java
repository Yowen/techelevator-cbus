package com.techelevator.postageCalculator;

public class SPUGround implements DeliveryDriver {

	private String name = "SPU (4-Day Ground)";
	
	@Override
	public double calculateRate(int distance, double weight) {
		return (weight * 0.0050) * distance;
	}
	
	@Override
	public String getName() {
		return name;
	}
}
