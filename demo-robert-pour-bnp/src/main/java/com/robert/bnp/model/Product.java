package com.robert.bnp.model;

public class Product {
	private int prodCode;
	private String productName;
	private int quantity;
	private double totalPrice;
	
	public int getProdCode() {
		return prodCode;
	}

	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}

	
 
	public Product(int prodCode,String productName, int quantity, double totalPrice) {
		this.productName = productName;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.prodCode = prodCode;
	}
 
	public String getProductName() {
		return productName;
	}
 
	public void setProductName(String productName) {
		this.productName = productName;
	}
 
	public int getQuantity() {
		return quantity;
	}
 
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
 
	public double getTotalPrice() {
		return totalPrice;
	}
 
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
