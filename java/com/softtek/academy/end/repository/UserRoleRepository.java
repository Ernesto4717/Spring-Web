package com.softtek.academy.end.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.softtek.academy.end.domain.UserRole;

@Repository
public class UserRoleRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<UserRole> getUserRoles() {

		return this.jdbcTemplate.query("SELECT * FROM user_role", new RowMapper<UserRole>() {
			@Override
			public UserRole mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new UserRole(rs.getString("user_role_id"),rs.getString("description"));
			}

		});

	}
}
