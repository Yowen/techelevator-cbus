package com.techelevator;
import java.util.Scanner;

public class RockPaperScissors {

	/*
	 * Command Line programs follow this structure:  Take Input, Calculate Data, Give Output
	 * 
	 * How could we use this structure, with what we know of Java, so far, to write a simple game
	 * like Rock, Paper, Scissors?
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);	
		String[] choices = { "Rock", "Paper", "Scissors" };
		int ties = 0;
		int userScore = 0;
		int computerScore = 0;
		
		for (;true;) {
			System.out.print("Select (1) Rock, (2) Paper, (3) Scissors, or (0) to quit: ");
			int userChoice = in.nextInt();
			in.nextLine();
			
			if (userChoice < 0 || userChoice > 3) {
				System.out.println("*** INVALID SELECTION ***");
				continue;
			}
			
			if (userChoice == 0) {
				System.out.println("Thank you for playing!");
				System.out.printf("%-15s %-15s %-15s\n", "Player Score", "Computer Score", "Tie");
				System.out.println("------------------------------------");
				System.out.printf("%-15s %-15s %-15s\n", userScore, computerScore, ties);
				System.out.println("------------------------------------");
				
				if (userScore > computerScore) {
					System.out.println("The Player wins!");
				}
				else if (computerScore > userScore) {
					System.out.println("The Computer wins!");
				}
				else {
					System.out.println("It's a tie!");
				}
				break;
			}
			
			int computerChoice = (int) (Math.random() * 3) + 1;
		
			System.out.println("You chose " +choices[userChoice - 1]);
			System.out.println("The Computer selected " + choices[computerChoice - 1]);
		
			if (userChoice == computerChoice) {
				System.out.println("It's a tie");
				ties++;
			}
			else if ((userChoice == 1 && computerChoice == 3) || 
					(userChoice == 2 && computerChoice == 1) ||
					(userChoice == 3 && computerChoice == 2)) {
				System.out.println("The Player wins");
				userScore++;
			}
			else {
				System.out.println("The Computer wins");
				computerScore++;
			}
		}
	}
}
