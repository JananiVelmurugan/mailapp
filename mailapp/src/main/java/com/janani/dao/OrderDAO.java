package com.janani.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.janani.model.Order;
import com.janani.util.ConnectionUtil;

public class OrderDAO {
	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public List<Order> list() {

		String sql = "select id,item,quantity from orders";
		List<Order> list = jdbcTemplate.query(sql, (rs, rowNum) -> {

			Order order = new Order();
			order.setId(rs.getInt("id"));
			order.setItem(rs.getString("item"));
			order.setQuantity(rs.getInt("quantity"));
			return order;

		});
		return list;

	}

}
