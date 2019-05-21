package com.techelevator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;


public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		List<String> instructors = new ArrayList<String>();
		instructors.add("John");
		instructors.add("Steve");
		instructors.add("Stephanie");
		instructors.add("Andrew");

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		
		// Can get the length of the list using size()
		for (int i = 0; i < instructors.size(); i++) {
			// Can get an item by index using the get(index) method
			System.out.println(instructors.get(i));
		}
		
		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		
		instructors.add("John");
		instructors.add(2, "Rachelle");
		for (int i = 0; i < instructors.size(); i++) {
			System.out.println(instructors.get(i));
		}
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		instructors.add(2, "Rachelle");
		for (int i = 0; i < instructors.size(); i++) {
			System.out.println(instructors.get(i));
		}
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		
		instructors.remove(5);
		for (int i = 0; i < instructors.size(); i++) {
			System.out.println(instructors.get(i));
		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");	

		boolean isAndrewInInstructors = instructors.contains("Andrew");
		System.out.println("Andrew is in the list: " + isAndrewInInstructors);

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
	
		// Declare an array		  = Pass toArray a new Array of the proper type and size to be filled
		String[] instructorsArray = instructors.toArray(new String[instructors.size()]);
		
		// Collections can only use Reference Types
		//List<int> numbers = new ArrayList<int>();
		

		System.out.println("####################");
		System.out.println(" PRIMITIVE WRAPPERS");
		System.out.println("####################");
		
		/* Every primitive data type has an equivalent "primitive wrapper class" that is an object representation 
		 * of a primitive value */
		Integer employees = new Integer(25);
		Integer piecesOfCake = new Integer("24");
		
		if (employees > piecesOfCake) {
			System.out.println("Not enough cake");
		}
		
		Integer objX = 10;
		int intY = 20;
		intY = objX + 5;
		objX = intY + 10;
		
		Double accountBalance = null;
		double newBalance = accountBalance + 100;
		// Since accountBalance is null, the next line causes a NullPointerException when autoboxing happens
		// double newBalance = accountBalance + 100;
		
		// Use the wrapper classes with Collections
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();


		System.out.println("####################");
		System.out.println("       QUEUES");
		System.out.println("####################");
		System.out.println();


		/////////////////////
		// PROCESSING ITEMS IN A QUEUE
		/////////////////////


		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");
		System.out.println();



		////////////////////
		// PUSHING ITEMS TO THE STACK
		//////////////////// 


		////////////////////
		// POPPING THE STACK
		////////////////////

	}
}
