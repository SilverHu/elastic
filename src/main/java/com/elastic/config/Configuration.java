package com.elastic.config;

import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.elastic.repository.mysql")
@EnableElasticsearchRepositories(basePackages = "com.elastic.repository.es")
public interface Configuration {

}
