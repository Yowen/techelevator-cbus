package com.techelevator.ssg.model.forum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ForumPost {
	private Long id;
	private String username;
	private String subject;
	private String message;
	private LocalDateTime datePosted;
	// Local datetime formatter
	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDatePosted() {
		return datePosted.format(DATE_FORMATTER);
	}
	
	public String getTimePosted() {
		return datePosted.format(TIME_FORMATTER);
	}

	public void setDatePosted(LocalDateTime datePosted) {
		this.datePosted = datePosted;
	}
}
