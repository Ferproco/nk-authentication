package com.nkauthentication.app.model;

public class JwtUser {
	private String userName;
	private long id;
	private String role;
	private Long empresaid;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public Long getEmpresaid() {
		return empresaid;
	}
	public void setEmpresaid(Long empresaid) {
		this.empresaid = empresaid;
	}
	
	
}
