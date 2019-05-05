package com.example.demoelasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


//@EnableScheduling
@EnableAsync
@SpringBootApplication
public class DemoElasticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoElasticsearchApplication.class, args);
    }

}
