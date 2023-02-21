package com.petshop.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperProducts implements RowMapper<Products>{

	public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
		Products slides = new Products();
		slides.setId(rs.getInt("id"));
		slides.setName(rs.getString("name"));
		slides.setImg(rs.getString("img"));
	
		slides.setPrice(rs.getString("price"));
		return slides;
	}
	
}
