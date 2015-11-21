package com.osrs.login.model;

public class RegisterRequest {

	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String reenterPassword;
	private String email;
	
	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public RegisterRequest(String userName, String password, String firstName,
			String lastName, String reenterPassword, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.reenterPassword = reenterPassword;
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


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


	public String getReenterPassword() {
		return reenterPassword;
	}


	public void setReenterPassword(String reenterPassword) {
		this.reenterPassword = reenterPassword;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public RegisterRequest() {
	} 
	
}