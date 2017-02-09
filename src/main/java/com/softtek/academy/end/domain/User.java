package com.softtek.academy.end.domain;

import java.util.Objects;

import com.google.common.base.MoreObjects;

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
	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final User other = (User) obj;
		return Objects.equals(this.userName, other.userName) 
				&& Objects.equals(this.password, other.password)
				&& Objects.equals(this.name, other.name) 
				&& Objects.equals(this.userRoleId, other.userRoleId)
				&& Objects.equals(this.active, other.active);
	}

	@Override
	public int hashCode() {

		return Objects.hash(this.userName, this.password, this.name, this.userRoleId, this.active);

	}

	@Override
	public String toString() {

		return MoreObjects.toStringHelper(this).add("userName", userName).add("password", password).toString();

	}

}
