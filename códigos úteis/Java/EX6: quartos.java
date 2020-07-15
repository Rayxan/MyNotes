//Program.java
package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Product;

public class Program{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[10];
		
		for(int i=1; i<=n; i++) {
			System.out.printf("Rent #%d:\n", i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Product(name, email);
			
			System.out.println();
		}
		
		System.out.println("Busy rooms:");
		for(int i=0;i<10;i++) {
			if(vect[i] != null)
				System.out.println(i + ": " + vect[i].print());
		}
		
		sc.close();
	}
}


//Product.java

package entities;

public class Product {
	private String name;
	private String email;
	
	public Product(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String print() {
		return name+
				", "+
				email;
	}
}
