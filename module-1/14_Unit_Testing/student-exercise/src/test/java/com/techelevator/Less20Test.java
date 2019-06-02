package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class Less20Test {

	private Less20 less20;
	
	@Before
	public void setup() {
		less20 = new Less20();
	}
	
	@Test
	public void if_multiple_of_20() {
		// Arrange
		// Act
		boolean isMultiple = less20.isLessThanMultipleOf20(20);
		// Assert
		Assert.assertFalse(isMultiple);
	}
	
	@Test
	public void if_1_less_than_multiple_of_20() {
		// Arrange
		// Act
		boolean notMultiple = less20.isLessThanMultipleOf20(19);
		// Assert
		Assert.assertTrue(notMultiple);
	}
	
	@Test
	public void if_2_less_than_multiple_of_20() {
		// Arrange
		// Act
		boolean notMultiple = less20.isLessThanMultipleOf20(18);
		// Assert
		Assert.assertTrue(notMultiple);
	}
	
}
