package com.techelevator.ssg.model;

import java.util.InputMismatchException;

import org.springframework.stereotype.Component;

@Component
public class WeightCalculator {

	public String calculateNewWeight(String earthWeight, String destination) {
		double weight = 0;
		try {
			weight = Double.parseDouble(earthWeight);
		} catch(NumberFormatException | InputMismatchException | NullPointerException e) {
			return "invalid weight";
		}
		
		switch(destination) {			
			case("mercury"):
				return (weight * 0.37) + "";
			case("venus"):
				return (weight * 0.9) + "";
			case("mars"):
				return (weight * 0.38) + "";
			case("jupiter"):
				return (weight * 2.65) + "";
			case("saturn"):
				return (weight * 1.13) + "";
			case("uranus"):
				return (weight * 1.09) + "";
			case("neptune"):
				return (weight * 1.43) + "";
			default:
				return "invalid planet";
		}
	}

}
