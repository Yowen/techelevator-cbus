package com.techelevator;

import java.util.HashMap;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("       MAPS");
		System.out.println("####################");
		System.out.println();
		
		/* DECLARING AND INSTANTIATING A MAP */
		Map<String, String> animalNoises = new HashMap<String, String>();
		
		/* ADDING ITEMS TO A MAP */

		animalNoises.put("Cow", "Moo");
		animalNoises.put("Chicken", "Cluck");
		animalNoises.put("Dog", "Bark");
		animalNoises.put("Cat", "Meow");
		
		/* UPDATING AN ITEM IN A MAP */
		animalNoises.put("Duck", "Quack");

		/* RETRIEVING AN ITEM FROM A MAP */
		String catNoise = animalNoises.get("Cat");
		System.out.println("The Cat says " + catNoise);;
		System.out.println("The Wolf says " + animalNoises.get("Wolf"));

		// keys must be unique, but the values do not
		animalNoises.put("Lion", "Roar");
		animalNoises.put("Duck", "Roar");
		
		/* REMOVING AN ITEM FROM A MAP */
		// An item can be removed from the Map using remove(key), if the 
		// key exists the value will be returned.
		String lionNoise = animalNoises.remove("Lion");
		System.out.println("The Lion Says " + lionNoise);
		
		// If the key does not exists, the null returned
		String lionNoiseAfterRemove = animalNoises.remove("Lion");
		System.out.println("Now the Lion says " + lionNoiseAfterRemove);
		
		
		/* CHECK IF AN ITEM EXISTS */
		boolean doesCatExist = animalNoises.containsKey("Lion");
		System.out.println("The key, Cat, exists is " + doesCatExist);
		
		// containsKey(key) returns TRUE if the KEY exists in the Map
		boolean doesCatExists = animalNoises.containsKey("Cat");
		System.out.println("The key, Cat, exists is " + doesCatExists);
		
		// containsValue(value) returns TRUE if the VALUE exists in the Map
		boolean doesMeowExist = animalNoises.containsValue("Meow");
		System.out.println("The Map has the value Meow: " + doesMeowExist);
		
		System.out.println();
		/* LOOPING OVER A MAP */

		for (String animalName : animalNoises.keySet()) {
			String noise = animalNoises.get(animalName);
			System.out.println("The " + animalName + " says " + noise);
		}

		
		System.out.println();
		/* THE MAP KEY AND VALUE DATA TYPES */
												// HashMap does not retain order
		//Map<Integer, String> numbersToWords = new HashMap<Integer, String>();
												// LinkedHashMap maintains the order of insertion
		//Map<Integer, String> numbersToWords = new LinkedHashMap<Integer, String>();
												// TreeMap maintains Natural Order
		Map<Integer, String> numbersToWords = new TreeMap<Integer, String>();
		
		numbersToWords.put(2,  "Two");
		numbersToWords.put(10,  "Ten");
		numbersToWords.put(25,  "Twenty-Five");
		numbersToWords.put(1,  "One");
		
		for (Integer number : numbersToWords.keySet()) {
			System.out.println(number + " is " + numbersToWords.get(number));;
		}
					
		System.out.println("####################");
		System.out.println("       SETS");
		System.out.println("####################");
		System.out.println();

		/* DECLARE AND INSTANTIATE A HashSet */
		Set<Integer> setOfNumbers = new HashSet<Integer>();
		
		/* ADD ITEMS TO THE SET */
		// Elements are added using add(0
		setOfNumbers.add(1);
		setOfNumbers.add(10);
		setOfNumbers.add(301);
		// Duplicates are ignored
		setOfNumbers.add(301);
		setOfNumbers.add(42);
		setOfNumbers.add(57);

		
		/* LOOP OVER A SET */
		for (Integer number : setOfNumbers) {
			System.out.println(number);
		}
		
		System.out.println();
		/* USE A SET TO REMOVE DUPLICATES AND ORDER THE ARRAY */
		String[] instructors = {"Rachelle", "John", "Andrew", "John", "Stephanie", "Rachelle", "Steve", "John", "Steve" };
		
		Set<String> instructorSet = new TreeSet<String>();
		for (String instructor : instructors) {
			instructorSet.add(instructor);
		}

		for (String instructor : instructorSet) {
			System.out.println(instructor);
		}

	}

}
