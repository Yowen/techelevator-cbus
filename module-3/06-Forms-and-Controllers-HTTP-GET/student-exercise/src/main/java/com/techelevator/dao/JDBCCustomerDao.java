package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.dao.model.Customer;

/**
 * JDBCCustomerDao
 */
@Component
public class JDBCCustomerDao implements CustomerDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JDBCCustomerDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Customer> searchAndSortCustomers(String name, String sort) {
		String sql = "";

		if (sort.equals("last_name")) {
			sql = "SELECT first_name, last_name, email, activebool FROM customer WHERE first_name = ? OR last_name = ? ORDER BY last_name ASC;";

		}

		else if (sort.equals("email")) {
			sql = "SELECT first_name, last_name, email, activebool FROM customer WHERE first_name = ? OR last_name = ? ORDER BY email ASC;";

		}

		else if (sort.equals("activebool")) {
			sql = "SELECT first_name, last_name, email, activebool FROM customer WHERE first_name = ? OR last_name = ? ORDER BY activebool ASC;";
		}

		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, name.toUpperCase(), name.toUpperCase());

		List<Customer> customers = new ArrayList<Customer>();

		while (result.next()) {
			customers.add(mapRowToCustomer(result));
		}
		return customers;
	}

	private Customer mapRowToCustomer(SqlRowSet result) {
		Customer c = new Customer();

		c.setFirstName(result.getString("first_name"));
		c.setLastName(result.getString("last_name"));
		c.setEmail(result.getString("email"));

		if (result.getBoolean("activebool")) {
			c.setActive(true);
		} else {
			c.setActive(false);
		}
		return c;
	}

}