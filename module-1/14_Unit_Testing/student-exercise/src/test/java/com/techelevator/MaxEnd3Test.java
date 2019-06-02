package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxEnd3Test {

	private MaxEnd3 maxEnd3;
	
	@Before
	public void setup() {
		maxEnd3 = new MaxEnd3();
	}
	
	@Test
	public void first_element_is_largest() {
		// Arrange
		int[] nums = new int[] { 11, 5, 9 };
		int[] target = new int[] { 11, 11, 11 };
		// Act
		int[] changedArray = maxEnd3.makeArray(nums);
		// Assert
		Assert.assertArrayEquals(target, changedArray);
	}
	
	@Test
	public void last_element_is_largest() {
		// Arrange
		int[] nums = new int[] { 2, 11, 3 };
		int[] target = new int[] { 3, 3, 3 };
		// Act
		int[] changedArray = maxEnd3.makeArray(nums);
		// Assert
		Assert.assertArrayEquals(target, changedArray);
	}
	
}
