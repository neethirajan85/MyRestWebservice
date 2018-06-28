package com.neethi.rest.webservice.MyRestWebservice.User;

import java.util.Date;

public class ExceptionResponse {
	
	Date date;
	String message;
	String description;
	public ExceptionResponse(Date date, String message, String description) {
		super();
		this.date = date;
		this.message = message;
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public String getMessage() {
		return message;
	}
	public String getDescription() {
		return description;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ExceptionResponse [date=" + date + ", message=" + message + ", description=" + description + "]";
	}

	
}
