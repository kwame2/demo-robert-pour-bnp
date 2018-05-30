package com.robert.bnp;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.robert.bnp.model.Product;
import com.robert.bnp.model.ShoppingCart;
//import com.robert.bnp.util.InputMenu;

@SpringBootApplication
public class DemoRobertPourBnpApplication {
	private static int ch = 10;
	public static void main(String[] args) {
		SpringApplication.run(DemoRobertPourBnpApplication.class, args);
		
		
		ShoppingCart cart = new ShoppingCart();
		
		//new InputMenu();
		
		Scanner input = new Scanner(System.in);
		int prodCode;
		String productName;
		int quantity;
		double totalPrice;
		char choice;     // pour contenir 'y' or 'n'

		do {
			System.out.println("Vous allez ajouter des produits au panier ");
			//ch = input.nextInt();
			System.out.println("Enter your prodCode: ");
			prodCode = input.nextInt();
			System.out.println("Enter your productName: ");
			productName = input.next();
			System.out.println("Enter the quantity: ");
			quantity = input.nextInt();
			System.out.println("Enter total price: ");
			totalPrice = input.nextDouble();
			cart.addProduct(new Product(prodCode,productName,quantity,totalPrice));
			//System.out.println(cart.productList.stream().findFirst().get().getProductName());
			System.out.println("Liste des produits en panier: ");
			displayCartProducts(cart.productList);
			System.out.println("Tapez Y ou y pour continuer à ajouter sinon tapez N ou n: ");
	        choice = input.next().charAt(0);
		}while((choice == 'y') || (choice == 'Y'));
		
		do {
			System.out.println("Tapez y pour enlever des produits du panier. sinon tapez n ");
			choice = input.next().charAt(0);
			System.out.println("Enter your prodCode: ");
			prodCode = input.nextInt();
			cart.removeProduct(prodCode);
			System.out.println("produit " + prodCode + " enlevé du panier avec succes" );
			System.out.println("Liste des produits en panier: ");
			displayCartProducts(cart.productList);
			System.out.println("Montant total en panier: ");
			System.out.println(cart.getTotalCartValue());
			System.out.println("Tapez Y ou y pour continuer à enlever des produits sinon tapez N ou n: ");
			choice = input.next().charAt(0);
		}while((choice == 'y') || (choice == 'Y'));
		
		System.out.println("Ainsi, toutes les caractéristiques demandées ont donc été implémentées mais sans les EXCEPTIONS en 25 minutes (il est donc important d'essayer l'application avec des données cohérentes - j'ai joint un fichier word pour vous donner un exemple de test. suivez cet exemple). Veuillez jeter aussi un coup d'oeil au test. j'ai réalisé l'application en faisant du TDD ");
		
		
		
		
		
		//cart.productList.stream().findFirst().get().getProductName();
		
	}
	
	
	
	public static void displayCartProducts(List<Product> prodList) {
		for(Product p: prodList) {
			System.out.println(
			p.getProdCode() + "-" 
							+ p.getProductName() + "-"
							+ p.getQuantity() + "-"
							+ p.getTotalPrice()
					);
		}
	}
}
