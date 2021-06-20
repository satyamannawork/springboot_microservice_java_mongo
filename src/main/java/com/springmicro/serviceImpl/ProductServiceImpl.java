package com.springmicro.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import com.springmicro.model.Product;
import com.springmicro.service.ProductService;
import com.springmicro.util.ServiceUnavaliableException;


//  in jax-rs @named annotation is used to declear any component /  service etc..
@Named
@Singleton
public class ProductServiceImpl implements ProductService{

	@Override
	public List<Product> getAllProduct() throws ServiceUnavaliableException {
		List <Product> list = new ArrayList<Product>() ;
		try {
		 Product product1  = new Product("first product", "100", "100") ;
		 Product product2  = new Product("second product", "101", "100") ;
		 Product product3  = new Product("third product", "102", "100") ;
		 list.add(product1) ; 
		 list.add(product2) ; 
		 list.add(product3) ; 
		
		}catch(Exception e) {
			throw new ServiceUnavaliableException(e.getLocalizedMessage()) ;
		}
		return list ;
	}

}
