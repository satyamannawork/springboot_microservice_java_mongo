package com.authentication.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication(scanBasePackages = {"com.authentication"}) 
//@ComponentScan(basePackages="com.authentication.controller")
//@SpringBootApplication
public class JWTAuthentication {

	public static void main(String[] args) {
		System.out.println("i am here5");
		SpringApplication.run(JWTAuthentication.class, args);
	}

}
