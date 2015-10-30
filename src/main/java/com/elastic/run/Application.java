package com.elastic.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.elastic.configuration.ElasticsearchConfiguration;

/**
 * 程序入口
 * @author chuanyinhu
 *
 */
@Configuration
@ComponentScan(basePackages = "com.elastic")
@EnableAutoConfiguration(exclude = {ElasticsearchConfiguration.class})
public class Application extends SpringBootServletInitializer {

	/**
	 * 支持jsp页面
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
