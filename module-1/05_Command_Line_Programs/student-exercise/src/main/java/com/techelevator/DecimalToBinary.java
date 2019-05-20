package com.techelevator;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String userInput = input.nextLine();
		String[] decimalValues = userInput.split(" ");
		
		for (int i = 0; i < decimalValues.length; i++) {
			long num = Long.parseLong(decimalValues[i]);
			
			// Generates reversed binary output
			String reverseBinaryOutput = "";
			while (num  > 0) {
				reverseBinaryOutput += (int) num % 2;
				num = num / 2;
			}
			
			// Reverse prints reversedBinaryOutput
			String binaryOutput = "";
			for (int j = 0; j < reverseBinaryOutput.length(); j++) {
				binaryOutput += reverseBinaryOutput.charAt(reverseBinaryOutput.length() - 1 - j);
			}
			
			// Reverse prints the string
			System.out.println(decimalValues[i] + " in binary is " + binaryOutput);
		}
		input.close();
	}
}