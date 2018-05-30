/*package com.robert.bnp.util;

import java.util.List;
import java.util.Scanner;

import com.robert.bnp.model.Product;
import com.robert.bnp.model.ShoppingCart;

public class InputMenu {
	
	//ShoppingCart cart = new ShoppingCart();
	
    public void display_menu() 
    {
	System.out.println("1) Add product in Cart\n2) remove product from cart\n3) list products in cart\n4) show total price Amount");
	System.out.print("Selection: ");
    }
    
    public void question()
    {
	System.out.println("Would you like to proceed or quit?");
	System.out.println("To proceed enter 9.");
	System.out.println("If you wish to quit enter 0.");
	Scanner q = new Scanner(System.in);
       
	switch (q.nextInt()) 
	{
	    case 0:
	    System.out.println ("Thank you and godbye.");
	    break;
  
	    case 9:
	    System.out.println ("Please proceed.");
	    new InputMenu();
	    break;
	    default:
	    System.err.println ( "Unrecognized option" );
	    break;
	}
    }
 
    public InputMenu() 
    {
	Scanner in = new Scanner(System.in);
        display_menu();
  
	switch (in.nextInt()) 
	{
	    case 1:
	    //System.out.println ( "You picked option 1" );
	    	int prodCode;
			String productName;
			int quantity;
			double totalPrice;
			
			System.out.print("Enter your prodCode: ");
			prodCode = in.nextInt();
			System.out.print("Enter your productName: ");
			productName = in.next();
			System.out.print("Enter the quantity: ");
			quantity = in.nextInt();
			System.out.print("Enter total price: ");
			totalPrice = in.nextDouble();
			cart.addProduct(new Product(prodCode,productName,quantity,totalPrice));
			displayCartProducts(cart.productList);
	    question();
	    break;
  
	    case 2:
	    //System.out.println ( "You picked option 2" );
	    	displayCartProducts(cart.productList);
	    question();
	    break;
  
	    case 3:
	    System.out.println ( "You picked option 3" );
	    question();
	    break;
	    default:
	    System.err.println ( "Unrecognized option" );
	    break;
	}
    }
    public void displayCartProducts(List<Product> prodList) {
		for(Product p: prodList) {
			System.out.println(
			p.getProdCode() + "-" 
							+ p.getProductName() + "-"
							+ p.getQuantity() + "-"
							+ p.getTotalPrice()
					);
		}
	}
 
    public static void main (String[]args) 
    {
	new InputMenu();
    }
}
*/