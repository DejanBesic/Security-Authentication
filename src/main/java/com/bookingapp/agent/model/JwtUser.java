package com.bookingapp.agent.model;

public class JwtUser {

	private String username;
	
	private int id;
	
	private String role;
	
	private String password;
	
	public JwtUser() {
		
	}

	public JwtUser(String username, int id, String role, String password) {
		super();
		this.username = username;
		this.id = id;
		this.role = role;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	


}
