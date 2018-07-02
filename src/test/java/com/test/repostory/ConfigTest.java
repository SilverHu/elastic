package com.test.repostory;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.elasticsearch.client.ElasticsearchClient;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.BaseTest;
import com.alibaba.fastjson.JSON;
import com.elastic.entity.es.EsSysUser;
import com.elastic.repository.es.EsSysUserDao;
import com.elastic.repository.mysql.SysUserDao;


public class ConfigTest  extends BaseTest{
	
	@Autowired
	private DataSource dataSouce;
	
	@Autowired
	private ElasticsearchClient elasticsearchClient;
	
	@Autowired
	private EsSysUserDao esSysUserDao;
	
	@Autowired
	private SysUserDao sysUserDao;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Test
	public void connect() {
		try {
			System.out.println("数据源："+ dataSouce);
			System.out.println("连接："+ dataSouce.getConnection());
			System.out.println("数据源：" + elasticsearchClient);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void configEs() {
		EsSysUser entity = new EsSysUser();
		entity.setId(1L);
		entity.setName("name1");
		entity.setEmail("mail1.com");
		esSysUserDao.save(entity);
		System.out.println(JSON.toJSONString(esSysUserDao.findAll()));
	}
	
	@Test
	public void configDB() {
		System.out.println(JSON.toJSONString(sysUserDao.findAll()));
	}
	
	@Test
	public void query() {
		Integer i = jdbcTemplate.queryForObject("select count(*) from sys_user", Integer.class);
		System.out.println("get user count is : " + i);
	}
}
