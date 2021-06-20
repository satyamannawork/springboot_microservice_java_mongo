package com.springmicro.model;

public class Product {

	private String productName ;
	private String productId ;
	private String productPrice ;
	
	public Product(String productName, String productId, String productPrice) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.productPrice = productPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	
}
