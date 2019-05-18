package com.techelevator;
import java.util.Scanner;
import java.lang.*;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the length: ");
		int userInput = (int) input.nextInt();
		input.nextLine();
		
		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		String measurement = input.nextLine();
		
		if (measurement.equalsIgnoreCase("f")) {
			float m = userInput * (float) 0.3048;
			System.out.println(userInput + "f is " + (int) m + "m");
		}
		else if (measurement.equalsIgnoreCase("m")){
			float f = userInput * (float) 3.2808399;
			System.out.println(userInput + "m is " + (int) f + "f");
		}	

	}
}
