package com.springmicro.model;

public class ErrorMessage {

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	private String message ;
	private String cause ;
	private String errorCode ;
	
	public ErrorMessage(final Exception e , final String errorCode){
		Throwable  throwable  =  e.getCause()   ;
		this.errorCode  =  errorCode ;
		this.message  =  e.getLocalizedMessage() ;
		this.cause  =  throwable.getLocalizedMessage()  ;
	}
	public ErrorMessage(final String  message, final String errorCode){
		this.errorCode  =  errorCode ;
		this.message  =  message;
		this.cause  =  message  ;
	}
	
}
