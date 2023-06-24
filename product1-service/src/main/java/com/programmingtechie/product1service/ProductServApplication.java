package com.programmingtechie.product1service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;

@SpringBootApplication()
@EnableEurekaClient
public class ProductServApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServApplication.class, args);
	}

}
