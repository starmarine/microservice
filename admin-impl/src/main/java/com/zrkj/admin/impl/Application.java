package com.zrkj.admin.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.zrkj.*")
@EnableMongoRepositories(basePackages = "com.zrkj.admin.mongo")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
