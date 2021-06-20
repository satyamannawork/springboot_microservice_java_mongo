package com.springmicro.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.springmicro.controller.ProductController;

//   
/*
 * it is used to jersey configuration
	with spring , disable the @component class 
	and register method  when not using jersey rest ,
 */

@Component
public class JerseyConfig extends ResourceConfig{

	JerseyConfig(){
		register(ProductController.class) ;
	}

}
	