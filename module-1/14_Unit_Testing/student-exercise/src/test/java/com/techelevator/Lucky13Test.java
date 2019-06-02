package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class Lucky13Test {

	private Lucky13 lucky13;
	
	@Before
	public void setup() {
		lucky13 = new Lucky13();
	}
	
	@Test
	public void contains_no_1_and_3_in_array() {
		// Arrange
		int[] array = new int[] { 0, 2, 4 };
		// Act
		boolean isTrue = lucky13.getLucky(array);
		// Assert
		Assert.assertTrue(isTrue);
	}
	
	@Test
	public void contains_1_and_3_in_array() {
		// Arrange
		int[] array = new int[] { 1, 2, 3 };
		// Act
		boolean isFalse = lucky13.getLucky(array);
		// Assert
		Assert.assertFalse(isFalse);
	}
	
	@Test
	public void contains_1_and_no_3_in_array() {
		// Arrange
		int[] array = new int[] { 1, 2, 4 };
		// Act
		boolean isFalse = lucky13.getLucky(array);
		// Assert
		Assert.assertFalse(isFalse);
	}
	
	@Test
	public void contains_3_and_no_1_in_array() {
		// Arrange
		int[] array = new int[] { 0, 2, 3 };
		// Act
		boolean isFalse = lucky13.getLucky(array);
		// Assert
		Assert.assertFalse(isFalse);
	}
}
