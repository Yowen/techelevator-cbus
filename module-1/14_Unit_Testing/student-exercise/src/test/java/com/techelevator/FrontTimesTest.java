package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class FrontTimesTest {

	private FrontTimes frontTimes;
	
	@Before
	public void setup() {
		frontTimes = new FrontTimes();
	}
	
	@Test
	public void if_str_length_less_than_3() {
		// Arrange
		// Act
		String frontTimesN = frontTimes.generateString("Ab", 2);
		// Assert
		Assert.assertEquals("AbAb", frontTimesN);
	}
	
	@Test
	public void if_str_greater_than_3() {
		// Arrange
		// Act
		String frontTimesN = frontTimes.generateString("Abcd", 2);
		// Assert
		Assert.assertEquals("AbcAbc", frontTimesN);
	}
	
}
