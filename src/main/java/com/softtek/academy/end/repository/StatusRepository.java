package com.softtek.academy.end.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.softtek.academy.end.domain.Status;

public class StatusRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Status> getStatus(String statusType) {
		
		return this.jdbcTemplate.query("SELECT * FROM status WHERE status_type = '" + statusType + "'",
				new RowMapper<Status>() {
					@Override
					public Status mapRow(ResultSet rs, int rowNum) throws SQLException {
						return new Status(rs.getLong("status_id"), rs.getString("description"),
								rs.getString("status_type"));
					}

				});
	}

}