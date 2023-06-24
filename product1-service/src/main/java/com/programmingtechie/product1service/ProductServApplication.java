package com.programmingtechie.product1service;

import com.programmingtechie.product1service.model.Product;
import com.programmingtechie.product1service.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.math.BigDecimal;
//import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;

@SpringBootApplication()
@EnableEurekaClient
public class ProductServApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServApplication.class, args);
	}


}
