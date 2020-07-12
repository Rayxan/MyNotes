//Program.java
package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();
		
//		System.out.println(product.toString());
		System.out.println(product);
		
		sc.close();
	}
}


//Product.java 

package entities;

public class Product{
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; // quando há ambiguidade entre uma variável e um atributo, pode se usar o prefixo this
	}
	
	public  void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { //sobreposição da função toString padrão do Object
		return name +
			", $" +
			String.format("%.2f", price) + 
			", " + 
			quantity + 
			", $" +
			String.format("%.2f", totalValueInStock());
	}
}
