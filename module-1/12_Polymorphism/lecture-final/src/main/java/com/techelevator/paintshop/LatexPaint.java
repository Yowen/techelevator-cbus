package com.techelevator.paintshop;

public class LatexPaint implements Paint {

	private int costPerBucket = 20;
	
	@Override
	public String getName() {
		return "Latex";
	}

	@Override
	public double calculateCost(int area) {
		return (area / 600) * costPerBucket;
	}

}
