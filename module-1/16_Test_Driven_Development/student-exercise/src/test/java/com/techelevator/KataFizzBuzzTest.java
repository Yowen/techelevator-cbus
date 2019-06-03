package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	
	private KataFizzBuzz kataFizzBuzz;

	@Before
	public void setup() {
		kataFizzBuzz = new KataFizzBuzz();
	}
	
	@Test
	public void divisible_by_3() {
		// Arrange
		// Act
		String output = kataFizzBuzz.fizzBuzz(3);
		// Assert
		Assert.assertEquals("1", output);
	}
	
}
