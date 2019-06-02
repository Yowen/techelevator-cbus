package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SameFirstLastTest {

	private SameFirstLast sameFirstLast;
	
	@Before
	public void setup() {
		sameFirstLast = new SameFirstLast();
	}
	
	@Test
	public void array_length_less_than_1() {
		// Arrange
		int[] nums = new int[] { };
		// Act
		boolean isFalse = sameFirstLast.isItTheSame(nums);
		// Assert
		Assert.assertFalse(isFalse);
	}
	
	@Test
	public void array_length_greater_than_0_and_first_and_last_elements_are_mismatched() {
		// Arrange
		int[] nums = new int[] { 1, 2, 3};
		// Act
		boolean isFalse = sameFirstLast.isItTheSame(nums);
		// Assert
		Assert.assertFalse(isFalse);
	}
	
	@Test
	public void array_length_greater_than0_and_first_and_last_elements_are_the_same() {
		// Arrange
		int[] nums = new int[] { 1, 2, 3, 1 };
		// Act
		boolean isTrue = sameFirstLast.isItTheSame(nums);
		// Assert
		Assert.assertTrue(isTrue);
	}
	
}
