package com.techelevator;

import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args)  {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What number do you want to stop at >>>");
		int endCount = in.nextInt();
		in.nextLine();
		
		for (int i = 1 ; i < endCount ; i++) {
			System.out.println(getFizzBuzz(i));
		}
		
	}
	
	
	private static String getFizzBuzz(int i) {
		String line = "";
		
		if (i % 3 == 0) {
			line += "Fizz";
		}
		if (i % 5 == 0) {
			line += "Buzz";
		}
		
		return line.length() > 0 ? line : String.valueOf(i);
	}

}
