//Progam.java

package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product p = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
//		System.out.print("Quantity: ");
//		int quantity = sc.nextInt();
		
		Product product = new Product(name,price); //Os parâmetos devem ser passados na hora de instanciar o objeto pois o construtor exige
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		
		product.setPrice(9.00);
		System.out.println("Updated price: " + product.getPrice());
		
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
		
		System.out.println();
		System.out.println("Quantity através do get: " + product.getQuantity());
		//obs: não faz sentido atribuir um valor através do método set no atributo quantidade,
		//pois o valor do atributo já está sendo atribuido através de outros métodos 
		sc.close();
	}
}

//Product.java

package entities;

public class Product{
	
	//Tornar os atributos private e utilizar somente gets e sets pra inserção e retorno de informação é o que torna o encapsulamento necessário 
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
		
	}
	
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
	
	//-----------------------------------------------------------
	
	//Por convenção, os métodos gets e sets devem ser criados após os contrutores
	//Tornar os atributos private e utilizar somente gets e sets pra inserção e retorno de informação é o que torna o encapsulamento necessário
	
	public String getName() {
		return name; // aqui está se referindo ao atributo name e não a variável, pois a variável não foi passada no escopo do método
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	//-----------------------------------------------------------
	
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
