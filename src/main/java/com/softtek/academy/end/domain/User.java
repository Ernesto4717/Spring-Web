package com.softtek.academy.end.domain;

public class User {

	private String userName;
	private String password;
	private String name;
	private UserRole userRoleId;
	private char active;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserRole getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(UserRole userRoleId) {
		this.userRoleId = userRoleId;
	}

	public char getActive() {
		return active;
	}

	public void setActive(char active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", name=" + name + ", userRoleId=" + userRoleId
				+ ", active=" + active + "]";
	}

}
