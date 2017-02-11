package com.softtek.academy.end.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.softtek.academy.end.domain.ShipTo;

public class ShipToRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<ShipTo> list() {
		
		return this.jdbcTemplate.query("SELECT ship_to_id, CONCAT(name, ' - ', address) name FROM ship_to", new RowMapper<ShipTo>() {
			@Override
			public ShipTo mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new ShipTo(rs.getLong("ship_to_id"), rs.getString("name"));
			}

		});
	}

}