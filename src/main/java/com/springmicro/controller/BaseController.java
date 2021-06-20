package com.springmicro.controller;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.springmicro.model.ErrorMessage;
import com.springmicro.util.ProductManagementException;

public abstract class BaseController {
			
	
	 protected <T> Response handleEntity (T ob){
		 if(ob == null) {
			return Response.status(404).build() ;
		 }else {
			return Response.ok(ob).build() ;
		 }
		 
	 }
	 // passing blank param as code as of now 
	 protected Response handleException(ProductManagementException exception) {
		 return Response.status(Status.NOT_FOUND).entity(new ErrorMessage(exception, "")).build() ;
		 
	 }
}
