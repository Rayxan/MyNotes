//Program.java

package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
//		System.out.print("Quantity: ");
//		int quantity = sc.nextInt();
		
		Product product = new Product(name,price); //Os parâmetos devem ser passados na hora de instanciar o objeto pois o construtor exige
		
//		System.out.println(product.toString());
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}
}

//-----------------------------------------------------------------------------------------

//Product.java

package entities;

public class Product{
	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) {//Método Construtor
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Sobrecarga é disponibilizar mais de uma versão da mesma operação
	public Product(String name, double price) {//Método Construtor (há uma sobrecarga aqui)
		this.name = name;
		this.price = price;
	}
	
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
