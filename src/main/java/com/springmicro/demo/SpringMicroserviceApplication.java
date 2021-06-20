package com.springmicro.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.springmicro"})
public class SpringMicroserviceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("*********************** This is command line runner ********************************");
		
	}
	
	

}
