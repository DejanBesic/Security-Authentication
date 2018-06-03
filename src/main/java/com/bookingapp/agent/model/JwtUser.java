package com.bookingapp.agent.model;

public class JwtUser {

	public String username;
	
	public long id;
	
	public String role;
	
	public JwtUser() {
		
	}
	
	public JwtUser(String username, long id, String role) {
		super();
		this.username = username;
		this.id = id;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


}
