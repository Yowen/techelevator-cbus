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
		String result = kataFizzBuzz.fizzBuzz(3);
		// Assert
		Assert.assertEquals("Fizz", result);
	}
	
	@Test
	public void divisible_by_5() {
		// Arrange
		// Act
		String result = kataFizzBuzz.fizzBuzz(5);
		// Assert
		Assert.assertEquals("Buzz", result);
	}
	
	@Test
	public void divisible_by_3_and_5() {
		// Arrange
		// Act
		String result = kataFizzBuzz.fizzBuzz(15);
		// Assert
		Assert.assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void is_number_0() {
		// Arrange
		// Act
		String result = kataFizzBuzz.fizzBuzz(0);
		// Assert
		Assert.assertEquals("", result);
	}
	
	@Test
	public void is_number_between_1_and_100() {
		// Arrange
		// Act
		String result = kataFizzBuzz.fizzBuzz(22);
		// Assert
		Assert.assertEquals("22", result);
	}
	
	@Test
	public void or_contains_3() {
		String result = kataFizzBuzz.fizzBuzz(13);
		Assert.assertEquals("Fizz", result);
	}
	
	@Test
	public void or_contains_5() {
		String result = kataFizzBuzz.fizzBuzz(52);
		Assert.assertEquals("Buzz", result);
	}
	
	@Test
	public void or_contains_3_and_5() {
		String result = kataFizzBuzz.fizzBuzz(53);
		Assert.assertEquals("FizzBuzz", result);
	}
	
}
