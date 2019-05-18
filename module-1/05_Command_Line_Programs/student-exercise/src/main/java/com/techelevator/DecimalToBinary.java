package com.techelevator;
import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long[] array = new long[5];
		
		System.out.print("Please enter in 5 decimal values (separated by spaces): ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (long) input.nextLong();
			String binary = Integer.toBinaryString((int)array[i]);
			System.out.println(array[i] + " in binary is " + binary);
		}
	}
}
