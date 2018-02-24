package com.springapp.beans.persistant;

public class User {
	private String email, password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [email=").append(email).append(", password=").append(password).append("]");
		return builder.toString();
	}
	
}
