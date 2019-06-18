package com.techelevator.addressbook;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

public class JDBCPersonDAOIntegrationTest {

	private static SingleConnectionDataSource dataSource;
	private PersonDAO dao;
	
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/addressbook");
		dataSource.setUsername("postgres");;
		dataSource.setPassword("postgres1");;
		dataSource.setAutoCommit(false);;
	}
	
	@AfterClass
	public static void closeDataSource() {
		dataSource.destroy();
	}
	
	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
	}
	
	@Before
	public void setup() {
		dao = new JDBCPersonDAO(dataSource);
	}
	
	@Test
	public void save_person() {
		// Arrange
		Person person = new Person();
		person.setFirstName("Test");
		person.setLastName("TestLast");
		
		// Act
		dao.save(person);
		
		// Assert
		Assert.assertTrue(person.getId() > 0);
	}
	
	@Test
	public void get_all_persons_returns_all_person() {
		
		// Arrange
		List<Person> originalList = dao.getAllPersons();
		int originalSize = originalList.size();
		
		Person personOne = new Person("TestOne", "TestOneLast");
		Person personTwo = new Person("TestTwo", "TestTwoLast");
		
		dao.save(personOne);;
		dao.save(personTwo);;
		
		// Act
		List<Person> newList = dao.getAllPersons();
		Assert.assertEquals(originalSize + 2,  newList.size());
		
	}
	
	@Test
	public void update_person() {
		
		// Arrange
		Person person = new Person("TestFirst", "TestLast");
		dao.save(person);;
		
		person.setFirstName("FirstUpdated");
		person.setLastName("LastUpdated");
		
		// Act
		dao.update(person);
		
		// Assert
		Person originalPerson = dao.getPersonById(person.getId());
		Assert.assertEquals(person,  actualPerson);
	}
	
}
