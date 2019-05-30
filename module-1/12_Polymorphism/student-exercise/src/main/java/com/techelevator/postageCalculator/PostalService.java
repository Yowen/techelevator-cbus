package com.techelevator.postageCalculator;

public class PostalService implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, double weight, int classType) {
		
		// First Class
		if (classType == 1) {
			if (weight >= 0 && weight <= 2) {
				return 0.035 * distance;
			}
			else if (weight >= 3 && weight <= 8) {
				return 0.040 * distance;
			}
			else if (weight >= 9 && weight <= 15) {
				return 0.047 * distance;
			}
			// Pounds converted to oz.
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
		// Second Class
		else if (classType == 2) {
			if (weight >= 0 && weight <= 2) {
				return 0.0035 * distance;
			}
			else if (weight >= 3 && weight <= 8) {
				return 0.0040 * distance;
			}
			else if (weight >= 9 && weight <= 15) {
				return 0.0047 * distance;
			}
			// Pounds converted to oz.
			else if (weight >= 16 && weight <= 48) {
				return 0.0195 * distance;
			}
			else if (weight >= 64 && weight <= 128) {
				return 0.0450 * distance;
			}
			else {
				return 0.0500 * distance;
			}
		}
		// Third Class
		else {
			if (weight >= 0 && weight <= 2) {
				return 0.0020 * distance;
			}
			else if (weight >= 3 && weight <= 8) {
				return 0.0022 * distance;
			}
			else if (weight >= 9 && weight <= 15) {
				return 0.0024 * distance;
			}
			// Pounds converted to oz.
			else if (weight >= 16 && weight <= 48) {
				return 0.0150 * distance;
			}
			else if (weight >= 64 && weight <= 128) {
				return 0.0170 * distance;
			}
			else {
				return 0.500 * distance;
			}
		}
	}
}
