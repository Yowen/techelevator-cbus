package com.techelevator.postageCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostageCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the weight of the package? ");
		double weight = (double) input.nextDouble();
		input.nextLine();
		
		System.out.print("(P)ounds or (O)unces? ");
		String choice = input.nextLine();
		
		System.out.print("What distance will it be traveling? ");
		int distance = (int) input.nextInt();
		
		// Converts Pounds to Oz.
		if (choice.equalsIgnoreCase("P")) {
			weight *= 16;
		}
		
		List<DeliveryDriver> deliveryMethods = new ArrayList<DeliveryDriver>();
		deliveryMethods.add(new PostalServiceFirstClass());
		deliveryMethods.add(new PostalServiceSecondClass());
		deliveryMethods.add(new PostalServiceThirdClass());
		deliveryMethods.add(new FexEd());
		deliveryMethods.add(new SPUGround());
		deliveryMethods.add(new SPUBusiness());
		deliveryMethods.add(new SPUNextDay());
		
		System.out.printf("%-30s  %-1s", "Delivery Method", "$ cost");
		System.out.println("\n--------------------------------------"); // 38
		for (DeliveryDriver deliveryMethod : deliveryMethods) {
			System.out.printf("\n%-30s  $%-1s", deliveryMethod.getName(), deliveryMethod.calculateRate(distance, weight));
		}
		
	}

}
