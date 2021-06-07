package com.nkauthentication.app.model;

public class Session {

	private String token;
	private JwtUser user;

	public Session() {

	}

	public Session(String tokenIn, JwtUser userIn) {
		token = tokenIn;
		user = userIn;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public JwtUser getUser() {
		return user;
	}

	public void setUser(JwtUser user) {
		this.user = user;
	}

}
