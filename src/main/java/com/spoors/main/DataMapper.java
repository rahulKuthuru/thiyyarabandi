package com.spoors.main;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DataMapper implements RowMapper<Data> {
	public Data mapRow(ResultSet rs, int rowNum) throws SQLException {
		Data data=new Data();
		data.setName(rs.getString("name"));
		data.setName(rs.getString("fname"));
		return data;	
	}
}
