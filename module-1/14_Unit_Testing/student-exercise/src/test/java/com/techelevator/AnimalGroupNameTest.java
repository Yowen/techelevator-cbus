package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class AnimalGroupNameTest {

	private AnimalGroupName animalGroupName;
	
	@Before
	public void setup() {
		animalGroupName = new AnimalGroupName();
	}
	
	@Test
	public void checking_for_rhino_group_name() {
		// Arrange
		// Act
		String output = animalGroupName.getHerd("rhino");
		// Assert
		Assert.assertEquals("Crash", output);
	}
	
	@Test
	public void checking_for_invalid_input() {
		// Arrange
		// Act
		String output = animalGroupName.getHerd("Invalid Input");
		// Assert
		Assert.assertEquals("unknown", output);
	}
	
}
