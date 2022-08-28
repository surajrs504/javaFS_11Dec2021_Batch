package com.foodbox.security;

import lombok.Data;

@Data
public class JWTAuthRequest {

	private String username;
	private String password;
	public JWTAuthRequest() {
		super();
	}
	public JWTAuthRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "JWTAuthRequest [username=" + username + ", password=" + password + "]";
	}
	
	
	
}
