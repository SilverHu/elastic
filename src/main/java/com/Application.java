package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.elastic.repository.mysql")
@EnableElasticsearchRepositories(basePackages = "com.elastic.repository.es")
public class Application {
    private static Logger log = LoggerFactory.getLogger(Application.class);
    
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        String[] profiles = context.getEnvironment().getActiveProfiles();
        if (profiles != null) {
            for (String profile : profiles) {
                log.debug("------------start with profile : " + profile);
            }
        }
    }
}
