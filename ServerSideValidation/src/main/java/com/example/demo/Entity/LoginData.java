package com.example.demo.Entity;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {

	
	@NotBlank(message = "Name cannot be Blank..!!")
	@Size(max = 15,min = 3,message = "Name Length should be between 3 to 15 characters.!!")
	private String username;
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "Innvalid Email..!!")
	private String email;
	
	@AssertTrue(message = "Please accept Terms and Conditions..!!")
	private boolean aggreed;
	
	public boolean isAggreed() {
		return aggreed;
	}

	public void setAggreed(boolean aggreed) {
		this.aggreed = aggreed;
	}

	public LoginData() {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LoginData(String username, String email) {
		super();
		this.username = username;
		this.email = email;
	}

	@Override
	public String toString() {
		return "LoginData [username=" + username + ", email=" + email + ", aggreed=" + aggreed + "]";
	}
	
	
}
