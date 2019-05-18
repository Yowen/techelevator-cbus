package com.techelevator;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the temperature: ");
		int temp = input.nextInt();
		input.nextLine();
		
		System.out.print("Is the temperature in (C)elsius, or (F)arenheit? ");
		String measurement = input.nextLine();
		
		if (measurement.equalsIgnoreCase("C")) {
			float f = (temp * (float) 1.8) + 32;
			System.out.println(temp + "C is " + (int) f + "F");
		}
		else if (measurement.equalsIgnoreCase("F")){
			float c = (temp - 32) / (float) 1.8;
			System.out.println(temp + "F is " + (int) c + "C");
		}
	}
}
