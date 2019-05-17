package com.techelevator;

public class LectureExtra {

	public static void main(String[] args) {
		// Sum all the numbers between 1 and 10
		int sum = 0;	
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		int sumEven = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			}
		}
		System.out.println(sumEven);
		
		int sumEven2 = 0;
		for (int i = 0; i <= 100; i += 2) {
			sumEven2 += i;
		}
		System.out.println(sumEven2);
		
		int sumEven3 = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				continue;
			}
			sumEven3 += i;
		}
		System.out.println(sumEven3);
		
		for (int i = 100; i >= 0; i--) {
			System.out.print(i + " ");
		}
	
		String[] instructors = new String[5];
		instructors[0] = "Steve";
		instructors[1] = "Rachelle";
		instructors[2] = "Stephanie";
		instructors[3] = "John";
		instructors[4] = "Andrew";
		
		System.out.println("\nPrint all the instructors");
		for (int i = 0; i < instructors.length; i++) {
			System.out.println(instructors[i]);
		}
		
		System.out.println("\nPrint all odd instructors");
		for (int i = 0; i < instructors.length; i++) {
			if (i % 2 == 1) {
				System.out.println(instructors[i]);
			}
		}
		
		System.out.println("\nPrint one odd instructors");
		for (int i = 0; i < instructors.length; i++) {
			if (i % 2 == 1) {
				System.out.println(instructors[i]);
				break;
			}
		}
		
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 2 * numbers[i];
			System.out.print(numbers[i] + " ");
		}
		
		int x = 0;
		for ( ; true ; ) {
			System.out.println(instructors[x]);
			x++;
			
			if (x >= instructors.length) {
				break;
			}
		}
	}
}
