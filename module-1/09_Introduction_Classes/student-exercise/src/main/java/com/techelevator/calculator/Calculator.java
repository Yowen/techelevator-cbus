package com.techelevator.calculator;

public class Calculator {
	
	private int result;
	
	public int getResult() {
		return result;
	}

	public int add(int addend) {
		result += addend;
		return result;
	}

	public int multiply(int multiplier) {
		result *= multiplier;
		return result;
	}
	
	public int power(int exponent) {
		result = (int) Math.pow(result, Math.abs(exponent));
		return result;
	}
	
	public void reset() {
		result = 0;
	}
	
	public int subtract(int subtrahend) {
		result -= subtrahend;
		return result;
	}
}
