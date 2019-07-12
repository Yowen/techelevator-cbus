package com.techelevator.ssg.model;

import java.util.InputMismatchException;

import org.springframework.stereotype.Component;

@Component
public class AgeCalculator {

	public double calculateNewAge(String originalAge, String planet) {
		double age = 0;
		try {
			age = Double.parseDouble(originalAge);
		} catch (NullPointerException | InputMismatchException | NumberFormatException e) {
			return age;
		}
		switch (planet) {
		case ("mercury"):
			return (age * 4.15);
		case ("venus"):
			return (age * 1.63);
		case ("mars"):
			return (age * 0.53);
		case ("jupiter"):
			return (age * 0.08);
		case ("saturn"):
			return (age * 0.03);
		case ("uranus"):
			return (age * 0.012);
		case ("neptune"):
			return (age * 0.006);
		default:
			return age;
		}
	}
}
