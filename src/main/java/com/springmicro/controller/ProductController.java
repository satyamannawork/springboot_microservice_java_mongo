package com.springmicro.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//import com.springmicro.util.ProductConstant.PRODUCTPATH;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.springmicro.model.Product;
import com.springmicro.service.ProductService;
import com.springmicro.util.ProductManagementException;

@Named
@Singleton
@Path(com.springmicro.util.ProductConstant.PRODUCTPATH)
public class ProductController extends BaseController {

	
	//  2 ways to create initialization of product service one is constructor base another one only declaring service class , we can use any one of them
	//  2 ways to annotate this @inject , @autowire
	
	
   @Inject
   // or  // @Autowired
	ProductService  productService ;
	
	@Autowired
	// or  // @Inject
	public ProductController(final ProductService productService) {
		this.productService = productService;
	}
	final static Logger log = LoggerFactory.getLogger(ProductController.class);
	
	 @GET
	 @Path("/getallproducts")
	 @Produces(MediaType.APPLICATION_JSON)
	 public Response getAllProducts() {
		 List<Product> productList =  new ArrayList<Product> () ;
		 try{
		 productList = productService.getAllProduct() ;
		 log.debug("list is "+productList);
		 return  handleEntity(productList) ;
		 }catch(ProductManagementException exception) {
			return   handleException(exception) ;
		 }
		 
		 
		 
	 }
	
	 
	
}
