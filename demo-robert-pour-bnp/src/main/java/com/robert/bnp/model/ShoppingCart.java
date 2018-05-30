package com.robert.bnp.model;

import java.util.ArrayList;
import java.util.List;

//import org.hamcrest.Matcher;

public class ShoppingCart {
	
	public List<Product> productList;
	private double totalCartValue;
	
	public ShoppingCart() {
		
		productList = new ArrayList<>();
		totalCartValue = 0;
	}

	public int getProductCount() {
		
		return productList.size();
	}

	public void addProduct(Product product) {
		
		productList.add(product);
		
	}
	
	public void removeProduct(int prodCode) {
		
		for(int i = 0; i < productList.size(); i++) {
			Object o = productList.get(i);
			Product prod = (Product)o;
			if(prod.getProdCode() == prodCode) {
				//Remove product
				productList.remove(i);
				break;
			}
		}
		
		//productList.remove(product);
		
	}

	public double getTotalCartValue() {
		
		if(productList.size() > 0) {
			for(Product product : productList) {
				totalCartValue = totalCartValue + product.getTotalPrice();
			}
		}
		
		return totalCartValue;
	}
	
	public List getAllProducts() {
		return productList;
	}
	
	

}
