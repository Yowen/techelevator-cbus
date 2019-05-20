package com.techelevator;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	    System.out.print("Please enter the Fibonacci number: ");
	    int n = input.nextInt();
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
