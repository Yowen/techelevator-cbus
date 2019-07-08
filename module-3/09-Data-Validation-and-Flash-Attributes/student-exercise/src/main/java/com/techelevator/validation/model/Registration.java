package com.techelevator.validation.model;

import java.util.Date;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Registration {

	@NotBlank(message="*")
	private String firstName;
	
	@NotBlank(message="*")
	private String lastName;
	
	@NotBlank(message="Invalid email")
	@Email(message="Please enter an email")
	private String email;
	
	@NotBlank(message="Email address does not match")
	@Email(message="Please enter an email")
	private String confirmEmail;
	
	@NotBlank(message="Password minimum is 8 characters")
	private String password;
	
	@NotBlank(message="Passwords do not match")
	private String confirmPassword;
	
	@NotBlank(message="Please enter a birthday")
	private Date birthday;
	
	@NotBlank(message="# of Tickets must be between 1 and 10")
	private int tickets;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmEmail() {
		return confirmEmail;
	}
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getTickets() {
		return tickets;
	}
	public void setTickets(int tickets) {
		this.tickets = tickets;
	}
	
}
