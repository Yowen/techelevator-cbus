package com.techelevator.postageCalculator;

public class SPUBusiness implements DeliveryDriver {

	private String name = "SPU (2-Day Business)";
	
	@Override
	public double calculateRate(int distance, double weight) {
		return (weight * 0.050) * distance;
	}
	
	@Override
	public String getName() {
		return name;
	}

}
