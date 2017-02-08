package com.softtek.academy.end.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.softtek.academy.end.domain.User;
import com.softtek.academy.end.domain.UserRole;

public class UserRepository {
	
	public List<User> list() {
		StringBuilder sql = new StringBuilder();

		sql.append("SELECT u.*, ur.description description ");
		sql.append("FROM user u ");
		sql.append("JOIN user_role ur ON ur.user_role_id = u.user_role_id");

		final List<User> users = new ArrayList<User>();

		try (Connection connection = DriverManagerDatabase.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());) {

			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				users.add(this.buildUser(rs));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return users;
	}

	public User findOne(final String userName) {
		PreparedStatement preparedStatement = null;

		User user = null;
		try {
			Connection connection = DriverManagerDatabase.getConnection();
			preparedStatement = connection.prepareStatement("SELECT * FROM user WHERE username = ?");
			preparedStatement.setString(1, userName);

			ResultSet rs = preparedStatement.executeQuery();

			rs.next();
			user = this.buildUser(rs);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}

	private User buildUser(final ResultSet rs) throws SQLException {
		User user = new User();
		final int columnCount = rs.getMetaData().getColumnCount();

		user.setUserName(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setName(rs.getString("name"));
		user.setActive(rs.getString("active").charAt(0));
		user.setUserRoleId(
				new UserRole(rs.getString("user_role_id"), columnCount > 5 ? rs.getString("description") : ""));
		return user;
	}
}
