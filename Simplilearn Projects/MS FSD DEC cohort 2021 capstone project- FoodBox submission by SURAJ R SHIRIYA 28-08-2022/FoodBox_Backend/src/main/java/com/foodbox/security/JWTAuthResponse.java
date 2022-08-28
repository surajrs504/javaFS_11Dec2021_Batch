package com.foodbox.security;

import lombok.Data;

@Data
public class JWTAuthResponse {

	private String token;

	public JWTAuthResponse() {
		super();
	}

	public JWTAuthResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	
	
}
