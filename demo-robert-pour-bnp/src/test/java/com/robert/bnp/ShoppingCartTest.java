package com.robert.bnp;



import org.junit.Test;

import com.robert.bnp.model.Product;
import com.robert.bnp.model.ShoppingCart;

import junit.framework.Assert;




public class ShoppingCartTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCreateEmptyShoppingCart() {
		
		ShoppingCart cart = new ShoppingCart();
		Assert.assertEquals(0, cart.getProductCount());
		//assertThat(0, equalTo(cart.getProductCount()));
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void addSingleProductToShoppingCart() {
		
		ShoppingCart cart = new ShoppingCart();
		Product product = new Product(101,"pate colgate", 1, 12.0);
		cart.addProduct(product);
		Assert.assertEquals(1, cart.getProductCount());
		Assert.assertEquals(12.0, cart.getTotalCartValue(),0.0);
		
	}
	
	@Test
	public void addDifferentProductsToTheCart(){
		ShoppingCart cart = new ShoppingCart();
		Product gatsByCream = new Product(102,"Gatsby hair cream", 1, 30.0);
		Product italianSoap = new Product(103,"Italian Soap", 1, 100.0);
		cart.addProduct(gatsByCream);
		cart.addProduct(italianSoap);
		Assert.assertEquals(2, cart.getProductCount());
		Assert.assertEquals(130.0, cart.getTotalCartValue(),0.0);
	}

}
