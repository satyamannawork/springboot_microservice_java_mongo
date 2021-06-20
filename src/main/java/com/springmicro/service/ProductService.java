package com.springmicro.service;

import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springmicro.model.Product;
import com.springmicro.util.ServiceUnavaliableException;

//  do not need to write @Named , @Singleton in service interface
public interface ProductService {

	public List<Product> getAllProduct() throws ServiceUnavaliableException ;
}
