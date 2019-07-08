package com.spoors.main;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class DataDAO {
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource)
	{
		this.dataSource=dataSource;
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
	}
	
	public void create(Data d) {
		String Query= SqlQueries.INSERT_STR;
		jdbcTemplateObject.update(Query,d.getName(),d.getFname());
		return;
	}
	
	public List<Data> listData(){
		String Query = SqlQueries.SELECT_STR;
		List<Data> datas=jdbcTemplateObject.query(Query, new DataMapper());
		return datas;
	}
	
	
	
}
