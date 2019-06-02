package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class StringBitsTest {

	private StringBits stringBits;
	
	@Before
	public void setup() {
		stringBits = new StringBits();
	}
	
	@Test
	public void every_other_character() {
		// Arrange
		// Act
		String result = stringBits.getBits("Hello");
		// Assert
		Assert.assertEquals("Hlo", result);
	}
	
}
