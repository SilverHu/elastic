package com.test.repostory;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.elasticsearch.client.ElasticsearchClient;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.BaseTest;


public class ConfigTest  extends BaseTest{
	
//	@Autowired
//	private DataSource dataSouce;
	
	@Autowired
	private ElasticsearchClient elasticsearchClient;
	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;

//	@Test
//	public void connect() {
//		try {
//			System.out.println("数据源："+ dataSouce);
//			System.out.println("连接："+ dataSouce.getConnection());
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
	
	@Test
	public void connectEs() {
		System.out.println("数据源：" + elasticsearchClient);
	}
	
//	@Test
//	public void query() {
//		Integer i = jdbcTemplate.queryForObject("select count(*) from sys_user", Integer.class);
//		System.out.println("get user count is : " + i);
//	}
}
