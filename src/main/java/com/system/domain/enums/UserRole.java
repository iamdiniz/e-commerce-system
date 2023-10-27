package com.system.domain.enums;

public enum UserRole {
	
	MERCHANT("merchant"),
	USER("user");
	
	private String role;
	
	UserRole(String role) {
		this.role = role;
	}
	
	public String getRole() {
		return role;
	}

}
