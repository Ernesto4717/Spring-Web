package com.softtek.academy.end.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.softtek.academy.end.domain.User;
import com.softtek.academy.end.domain.UserRole;

@Repository
public class UserRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<User> list() {
		StringBuilder sql = new StringBuilder();

		sql.append("SELECT u.*, ur.description description ");
		sql.append("FROM user u ");
		sql.append("JOIN user_role ur ON ur.user_role_id = u.user_role_id");
		return this.jdbcTemplate.query(sql.toString(), new RowMapper<User>() {
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				return buildUser(rs);
			}
		});
	}

	public User findOne(final String userName) {
		return this.jdbcTemplate.queryForObject("SELECT * FROM user WHERE username = '" + userName + "'",
				new RowMapper<User>() {

					@Override
					public User mapRow(ResultSet rs, int rowNum) throws SQLException {
						return buildUser(rs);
					}

				});
	}

	public boolean updateUser(final User user){
	 this.jdbcTemplate.update("UPDATE user u "
				+ "SET "
				+ "u.password = ?, "
				+ "u.name= ? "
		+ " WHERE u.username= ? ",user.getPassword(),user.getName(),user.getUserName());
		return true;
	}
	
	private User buildUser(final ResultSet rs) throws SQLException {
		User user = new User();
		final int columnCount = rs.getMetaData().getColumnCount();

		user.setUserName(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setName(rs.getString("name"));
		user.setActive(rs.getString("active"));
		user.setUserRoleId(
				new UserRole(rs.getString("user_role_id"), columnCount > 5 ? rs.getString("description") : ""));
		return user;
	}
}
