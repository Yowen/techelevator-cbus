package com.techelevator.addressbook;

import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;

public class PersonExample {

	public static void main(String[] args) {
		
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/addressbook");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		
		PersonDAO dao = new JDBCPersonDAO(dataSource);
		
		Person person = new Person();
		person.setFirstName("Andrew");;
		person.setLastName("Franks");;
		
		dao.save(person);;
		
		Person newPerson = dao.getPersonById(person.getId());
		
		System.out.println(person.getId());
		
		List<Person> allPersons = dao.getAllPersons();
		for (Person p : allPersons) {
			System.out.println(p);
		}
		
		person.setLastName("Frank");;
		dao.update(person);
		
		person.setLastName("Frank");;
		dao.update(person);;
		
		dao.delete(person.getId());
		
		for(Person p : dao.getAllPersons()) {
			System.out.println(p);
		};
		
	}

}
