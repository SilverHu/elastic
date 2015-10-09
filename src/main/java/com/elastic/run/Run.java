package com.elastic.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * 程序入口
 * @author chuanyinhu
 *
 */
@EnableAutoConfiguration
public class Run {

	public static void main(String[] args) {
		SpringApplication.run(Run.class, args);
	}
}
