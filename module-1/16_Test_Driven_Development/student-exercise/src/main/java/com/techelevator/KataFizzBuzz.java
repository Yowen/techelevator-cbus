package com.techelevator;

public class KataFizzBuzz {

	public String fizzBuzz(int number) {
		
		String input = Integer.toString(number);
		
		if (number > 100 || number < 1) {
			return "";
		}
		else if (number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";
		}
		else if (number % 3 == 0 && number % 5 != 0) {
			return "Fizz";
		}
		else if (number % 5 == 0 && number % 3 != 0) {
			return "Buzz";
		}
		else if (input.contains("3") && input.contains("5")) {
			return "FizzBuzz";
		}
		else if (input.contains("3")) {
			return "Fizz";
		}
		else if (input.contains("5")) {
			return "Buzz";
		}
		else {
			return Integer.toString(number);
		}
	}
}
