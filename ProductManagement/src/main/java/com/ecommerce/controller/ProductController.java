package com.ecommerce.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.modal.Product;

@RestController
public class ProductController {

	
	
	
	@RequestMapping( value ="/getproductlist" , method = RequestMethod. GET)  
	public Product getProductList(@RequestParam("cat") String category ) {
		Product product = new Product("001" ,  "Lenovo" ,  "20000") ;
		return product ;
	}
}
