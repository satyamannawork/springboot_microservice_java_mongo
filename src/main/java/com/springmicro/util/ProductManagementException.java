package com.springmicro.util;

import com.springmicro.model.ErrorMessage;

public class ProductManagementException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message ;
    private  ErrorMessage erroMessage ;	
	
	protected ProductManagementException(final String msg){
		super(msg) ;
		this.message = msg ;
		this.erroMessage = new ErrorMessage(this.message,  "")  ;
		
		
	}
	
}
