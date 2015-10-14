package com.elastic.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
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
public class Run {

	public static void main(String[] args) {
		SpringApplication.run(Run.class, args);
	}
}
