//Program.java

package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Product;

public class Program{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for(int i = 0; i<vect.length;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price);
		}
		
		double sum=0;
		
		for(int i =0;i<vect.length;i++) {
			sum += vect[i].getPrice();
		}
		
		System.out.printf("AVERAGE PRICE = %.2f\n", sum/n);
		
		sc.close();
	}
}

//Product.java

package entities;

public class Product{
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
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
	
}
