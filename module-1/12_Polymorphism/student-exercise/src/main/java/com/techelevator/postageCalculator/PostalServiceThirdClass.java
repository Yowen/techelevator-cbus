package com.techelevator.postageCalculator;

public class PostalServiceThirdClass implements DeliveryDriver {
	
	private String name = "Postal Service (3rd Class)";
	
	@Override
	public double calculateRate(int distance, double weight) {
		if (weight >= 0 && weight <= 2) {
			return 0.0020 * distance;
		}
		else if (weight >= 3 && weight <= 8) {
			return 0.0022 * distance;
		}
		else if (weight >= 9 && weight <= 15) {
			return 0.0024 * distance;
		}
		else if (weight >= 16 && weight <= 48) {
			return 0.0150 * distance;
		}
		else if (weight >= 64 && weight <= 128) {
			return 0.0160 * distance;
		}
		else {
			return 0.0170 * distance;
		}
	}
	
	@Override
	public String getName() {
		return name;
	}
}
