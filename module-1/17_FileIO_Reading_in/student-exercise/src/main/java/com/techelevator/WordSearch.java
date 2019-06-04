package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// alices_adventures_in_wonderland.txt

public class WordSearch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("What is the file that should be searched?");
		String fileName = input.nextLine();
		File file = new File(fileName);
		
		System.out.println("What is the search word you are looking for?");
		String word = input.nextLine();
		
		System.out.println("Should the search be case sensitive? (Y/N)");
		String choice = input.nextLine();
		
		long lineCount = 0;
		
		try (Scanner fileScanner = new Scanner(file)) {
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				lineCount++;
				
				// Case sensitive
				if (choice.equalsIgnoreCase("y")) {
					if (line.contains(word)) {
						System.out.println(lineCount + ") " + line);
					}
				}
				// Not case sensitive
				if (choice.equalsIgnoreCase("n")) {
					String[] array = line.split(" ");
					for (String obj : array) {
						if (obj.equalsIgnoreCase(word)) {
							System.out.println(lineCount + ") " + line);
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File " + file.getAbsolutePath() + " not found");
		}
	}
}
