package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateFashionTest {

	private DateFashion dateFashion;
	
	@Before
	public void setup() {
		dateFashion = new DateFashion();
	}
	
	@Test
	public void if_you_are_2_or_less() {
		// Arrange
		// Act
		int noTable = dateFashion.getATable(2, 5);
		// Assert
		Assert.assertEquals(0, noTable);
	}
	
	@Test
	public void if_your_date_is_2_or_less() {
		// Arrange
		// Act
		int noTable = dateFashion.getATable(5, 2);
		// Assert
		Assert.assertEquals(0, noTable);
	}
	
	@Test
	public void if_you_are_8_or_more() {
		// Arrange
		// Act
		int getTable = dateFashion.getATable(8, 5);
		// Assert
		Assert.assertEquals(2, getTable);
	}
	
	@Test
	public void if_your_date_is_8_or_more() {
		// Arrange
		// Act
		int getTable = dateFashion.getATable(5, 8);
		// Assert
		Assert.assertEquals(2, getTable);
	}
	
	@Test
	public void if_you_and_your_date_are_average() {
		// Arrange
		// Act
		int maybeTable = dateFashion.getATable(5, 5);
		// Assert
		Assert.assertEquals(1, maybeTable);
	}
	
}
