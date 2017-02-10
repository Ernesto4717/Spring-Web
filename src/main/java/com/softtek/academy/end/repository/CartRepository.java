package com.softtek.academy.end.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.softtek.academy.end.domain.Cart;
import com.softtek.academy.end.domain.ShipTo;
import com.softtek.academy.end.domain.Status;

@Repository
public class CartRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Cart> list() {
		StringBuilder sql = new StringBuilder();

		sql.append("SELECT c.*, st.name ship_to, s.description status");
		sql.append("  FROM cart c");
		sql.append("  JOIN ship_to st ON st.ship_to_id = c.ship_to_id");
		sql.append("  JOIN status s ON s.status_id = c.status_id");

		return this.jdbcTemplate.query(sql.toString(), new RowMapper<Cart>() {

			@Override
			public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
				return buildCart(rs);
			}

		});

	}

	public Cart findOne(final Long cartId) {
		return this.jdbcTemplate.queryForObject("SELECT * FROM cart WHERE cart_id = "+ cartId, new RowMapper<Cart>(){

			@Override
			public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
				return buildCart(rs);
			}
			
		});
	}

	private Cart buildCart(final ResultSet rs) throws SQLException {
		Cart cart = new Cart();

		final int columnCount = rs.getMetaData().getColumnCount();

		cart.setId(rs.getLong("cart_id"));
		cart.setLinesAmount(rs.getDouble("lines_amount"));
		cart.setShippingAmount(rs.getDouble("shipping_amount"));
		cart.setCartAmount(rs.getDouble("cart_amount"));
		cart.setShipTo(new ShipTo(rs.getLong("ship_to_id"), columnCount > 10 ? rs.getString("ship_to") : ""));
		cart.setStatus(new Status(rs.getLong("status_id"), columnCount > 10 ? rs.getString("status") : "", ""));

		return cart;
	}
}