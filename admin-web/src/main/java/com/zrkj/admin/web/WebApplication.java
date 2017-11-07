package com.zrkj.admin.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableFeignClients(basePackages = "com.zrkj.admin.api.**")
@EnableDiscoveryClient
@ComponentScan("com.zrkj")
@EnableAspectJAutoProxy
public class WebApplication {
	
	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

	
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}
