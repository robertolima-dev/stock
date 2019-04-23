package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// System.out.println(product.name);
		// System.out.println(product.price);
		// System.out.println(product.quantity);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		product.setName("Computer");
		System.out.println("Updated name: "+ product.getPrice());
		product.setPrice(1200.00);
		System.out.println("Updated price: "+ product.getPrice());
		
		System.out.println();
		System.out.print("Product data: " + product); // implicitamente chama o metodo toString do obj
		
		System.out.println();
		System.out.print("Enter the number of products to be added in Stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.print("Update data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from Stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.print("Update data: " + product);
		
		sc.close();
	}

}
