package com.ecommerce.productmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages =  {"com.ecommerce.*"}) 
public class ProductmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductmanagementApplication.class, args);
	}

}
