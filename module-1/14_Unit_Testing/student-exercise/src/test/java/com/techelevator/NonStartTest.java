package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class NonStartTest {

	private NonStart nonStart;
	
	@Before
	public void setup() {
		nonStart = new NonStart();
	}
	
	@Test
	public void first_str_length_0() {
		// Arrange
		String firstStr = "";
		String secondStr = "Second";
		// Act
		String result = nonStart.getPartialString(firstStr, secondStr);
		// Assert
		Assert.assertEquals("econd", result);
	}
	
	@Test
	public void second_str_length_0() {
		// Arrange
		String firstStr = "First";
		String secondStr = "";
		// Act
		String result = nonStart.getPartialString(firstStr, secondStr);
		// Assert
		Assert.assertEquals("irst", result);
	}
	
	@Test
	public void both_str_length_greater_than_0() {
		// Arrange
		String firstStr = "First";
		String secondStr = "Second";
		// Act
		String result = nonStart.getPartialString(firstStr,  secondStr);
		// Assert
		Assert.assertEquals("irstecond", result);
	}
	
}
