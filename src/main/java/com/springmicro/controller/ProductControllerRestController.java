package com.springmicro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.springmicro.model.Product;



/**
 * @author satyajit
 * this is entry point of spring MVC rest 
 *
 */
@RestController
public class ProductControllerRestController { 
	
	@GetMapping(value = "/products/getProduct")
	//@RequestMapping(value ="/products/getProduct" , method = RequestMethod.GET) 
	public ResponseEntity<Object>  getAllProducts(){
		 Product product1  = new Product("first product", "100", "100") ;
		 Product product2  = new Product("second product", "101", "100") ;
		 Product product3  = new Product("third product", "102", "100") ;
		 List <Product> list = new ArrayList<Product>() ;
		 list.add(product1) ; 
		 list.add(product2) ; 
		 list.add(product3) ; 
		 try {
			return new ResponseEntity<Object>(list , HttpStatus.OK) ;
		 }catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
			 return  null ;
		}
	}
	
	
	 
	
	
}
