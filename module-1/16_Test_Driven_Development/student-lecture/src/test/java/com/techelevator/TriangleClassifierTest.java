package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class TriangleClassifierTest {

	private TriangleClassifier classifier;
	
	@Before 
	public void setup() {
		classifier = new TriangleClassifier();
	}
	
	@Test
	public void identifies_equilateral_triangle() {
		String type = classifier.classify(4,  4,  4);
		Assert.assertEquals("equilateral", type);
	}
	
	@Test
	public void identifies_isosceles_triangle() {
		String type = classifier.classify(2, 2, 3);
		Assert.assertEquals("sides 1 and 2 equal","isosceles", type);
	
		type = classifier.classify(2, 3, 2);
		Assert.assertEquals("sides 1 and 3 equal",  "isosceles", type);
		
		type = classifier.classify(1, 2, 2);
		Assert.assertEquals("sides 2 and 3 equal", "isosceles", type);
	}
	
	@Test
	public void identifies_scalene_triangle() {
		String type = classifier.classify(2, 3, 4);
		Assert.assertEquals("scalene", type);
	}
	
	@Test
	public void identifies_invalid_with_unequal_sides() {
		String type = classifier.classify(1,  2,  4);
		Assert.assertEquals("Sides 1 and 2 < 3", "invalid", type);
		type = classifier.classify(1,  4,  2);
		Assert.assertEquals("Sides 1 and 3 < 2", "invalid", type);
	}
	
	@Test
	public void identifies_invalid_with_2_equal_sides() {
		Assert.assertEquals("side 1 and 2 equal", "invalid", classifier.classify(2, 2, 5));
		Assert.assertEquals("side 1 and 2 equal", "invalid", classifier.classify(2, 2, 5));
		Assert.assertEquals("side 1 and 2 equal", "invalid", classifier.classify(2, 2, 5));
	
	}
	
}
