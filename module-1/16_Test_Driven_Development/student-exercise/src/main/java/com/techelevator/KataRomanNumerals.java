package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class KataRomanNumerals {

	public int convertToDigit(String romanNumeral) {
		
		Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		romanNumeral = romanNumeral.toUpperCase();
		int number = 0;
		
		for (int i = 0; i < romanNumeral.length() - 1; i++) {
			char numeral = romanNumeral.charAt(i);
			char nextNumeral = romanNumeral.charAt(i + 1);
			
			if (romanMap.get(numeral) < romanMap.get(nextNumeral)) {
				number -= romanMap.get(numeral);
			}
			
			else {
				number += romanMap.get(numeral);
			}
		}
		
		number += romanMap.get(romanNumeral.charAt(romanNumeral.length() - 1));
		
		return number;
		
	}

	
}
