package com.test.repostory;

import java.sql.SQLException;
import java.util.Date;
import java.util.UUID;

import javax.sql.DataSource;

import com.elastic.entity.es.EsSysLog;
import com.elastic.repository.es.EsSysLogDao;
import org.elasticsearch.client.ElasticsearchClient;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;

import com.BaseTest;
import com.alibaba.fastjson.JSON;
import com.elastic.repository.mysql.SysUserDao;


public class ConfigTest extends BaseTest {

    @Value("#{environment['elastic.index.suffix']}")
    private String aaa;
    @Autowired
    private DataSource dataSouce;

    @Autowired
    private ElasticsearchClient elasticsearchClient;

    @Autowired
    private EsSysLogDao esSysLogDao;

    @Autowired
    private SysUserDao sysUserDao;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void connect() {
        try {
            System.out.println("数据源：" + dataSouce);
            System.out.println("连接：" + dataSouce.getConnection());
            System.out.println("数据源：" + elasticsearchClient);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void readConfig() {
        Assert.assertEquals(aaa, "pdf");
    }

    @Test
    public void configEs() {
        EsSysLog entity = new EsSysLog();
        entity.setId(UUID.randomUUID().toString());
        entity.setIp("127.0.0.1");
        entity.setOperateContent("测试");
        entity.setReason("no reason");
        entity.setRecordTime(new Date());
        entity.setUri("/test");
        entity.setResult(1);
        entity.setUserName("test user");
        esSysLogDao.save(entity);
        System.out.println(JSON.toJSONString(esSysLogDao.findAll()));
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
