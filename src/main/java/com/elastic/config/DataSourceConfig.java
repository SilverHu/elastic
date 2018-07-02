package com.elastic.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
/**
 * 多数据源配置
 * @author hucy
 *
 */
@Configuration
@EnableTransactionManagement
public class DataSourceConfig {

//	private Logger log = LoggerFactory.getLogger(DataSourceConfig.class);
//	
//	@Bean("mysqlDataSource")
//	@Qualifier("mysqlDataSource")
//	@ConfigurationProperties(prefix="spring.datasource")
//	public DataSource mysqlDataSource() {
//		DataSource dataSource = new org.apache.tomcat.jdbc.pool.DataSource();
//		return dataSource;
//	}
//	
//	@Bean(name = "mysqlEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean mssqlEntityManagerFactory(
//            EntityManagerFactoryBuilder builder) {
//        return em;
//    }
//	
//	@Bean(name = "esEntityManagerFactory")
//	public EntityManagerFactory esManagerFactory() {
//    // …
//	}
}
