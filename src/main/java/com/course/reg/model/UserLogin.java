package com.course.reg.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

public class UserLogin implements Serializable{

	private static final long serialVersionUID = 4414074924540859156L;

	@NotBlank(message = "Login username should not be empty")
	private String loginUsername;
	@NotBlank(message = "Login Password should not be empty")
	private String loginPassword;
	private String role;

	public UserLogin() {
	}

	public UserLogin(@NotBlank(message = "Login username should not be empty") String loginUsername,
			@NotBlank(message = "Login Password should not be empty") String loginPassword, String role) {
		super();
		this.loginUsername = loginUsername;
		this.loginPassword = loginPassword;
		this.role = role;
	}

	public String getLoginUsername() {
		return loginUsername;
	}

	public void setLoginUsername(String loginUsername) {
		this.loginUsername = loginUsername;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserLogin [loginUsername=" + loginUsername + ", loginPassword=" + loginPassword + ", role=" + role
				+ "]";
	}
}
