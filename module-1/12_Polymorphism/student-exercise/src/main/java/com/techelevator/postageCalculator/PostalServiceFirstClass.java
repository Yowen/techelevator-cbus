package com.techelevator.postageCalculator;

public class PostalServiceFirstClass implements DeliveryDriver {
	
	private String name = "Postal Service (1st Class)";

	@Override
	public double calculateRate(int distance, double weight) {
		if (weight >= 0 && weight <= 2) {
			return 0.035 * distance;
		}
		else if (weight >= 3 && weight <= 8) {
			return 0.040 * distance;
		}
		else if (weight >= 9 && weight <= 15) {
			return 0.047 * distance;
		}
		else if (weight >= 16 && weight <= 48) {
			return 0.195 * distance;
		}
		else if (weight >= 64 && weight <= 128) {
			return 0.450 * distance;
		}
		else {
			return 0.500 * distance;
		}
	}

	@Override
	public String getName() {
		return name;
	}

}
