package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TollCalculator {

	public static void main(String[] args) {
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		int totalMiles = 0;
		double totalRevenue = 0;
		
		vehicles.add(new Car(false));
		vehicles.add(new Car(true));
		vehicles.add(new Tank());
		vehicles.add(new Truck(4));
		vehicles.add(new Truck(6));
		vehicles.add(new Truck(8));
		
		System.out.printf("%-20s  %-20s  %-1s\n", "Vehicle", "Distance Traveled", "Toll $");
		System.out.println("--------------------------------------------------"); // 50 dashes
		
		for (Vehicle vehicle : vehicles) {
			int distance = (int) (Math.random() * 241 + 10);
			double toll = vehicle.calculateToll(distance);
			System.out.printf("%-20s  %-21d  %-1.2f\n", vehicle.getVehicleName(), distance, toll);
			totalMiles += distance;
			totalRevenue += toll;
		}
		
		System.out.println("\nTotal Miles Traveled: " + totalMiles);
		System.out.printf("Total Tollbooth Revenue: $%-1.2f", totalRevenue);
		
		
	}

}
