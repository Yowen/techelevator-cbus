package com.techelevator;
import java.util.Scanner;
import java.lang.*;

public class LinearConvert {

	public static void main(String[] args) {
		/*
		Write a program that converts meters to feet and vice-versa.

		The foot to meter conversion formula is:

		    m = f * 0.3048

		The meter to foot conversion formula is:

		    f = m * 3.2808399

		Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet. Convert the length to the opposite measurement, and display the old and new measurements to the console.

		```
		Please enter the length: 58
		Is the measurement in (m)eter, or (f)eet? f
		58f is 17m.
		```
		*/
		
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
