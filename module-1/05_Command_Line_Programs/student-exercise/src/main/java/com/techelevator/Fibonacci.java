package com.techelevator;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		/*
		The Fibonacci numbers are the integers in the following sequence:

		    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

		By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent 
		number is the sum of the previous two.

		Write a command line program which prompts the user for an integer value and display the Fibonacci 
		sequence leading up to that number.

		```
		Please enter the Fibonacci number: 25

		0, 1, 1, 2, 3, 5, 8, 13, 21
		```
		*/
		
		Scanner console = new Scanner(System.in);
	    System.out.print("Please enter the Fibonacci number: ");
	    int n = console.nextInt();
	    System.out.println("");
	    

	    System.out.print("0, 1, 1, ");
	    int f1 = 1;
	    int f2 = 1;
	    for(int i = 1; i + f2 < n;) {
	        f1 = i + f2;
	        i = f2;
            f2 = f1;
            System.out.print(f1);
            if (i + f2 < n) {
            	System.out.print(", ");
            }
            else {
            	break;
            }
	    } 
	}
}
