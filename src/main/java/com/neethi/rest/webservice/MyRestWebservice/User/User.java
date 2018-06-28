package com.neethi.rest.webservice.MyRestWebservice.User;

import javax.persistence.Id;

public class User {
	@Id
	private int id;
	private String name;
	private int age;
	private String email;
	private String last_access_date;

	
	
	public User() {
		super();
	}

	
	public User(int id, String name, int age, String email, String last_access_date) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.last_access_date = last_access_date;
	}


	public String getLast_access_date() {
		return last_access_date;
	}

	public void setLast_access_date(String last_access_date) {
		this.last_access_date = last_access_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", last_access_date="
				+ last_access_date + "]";
	}

}
