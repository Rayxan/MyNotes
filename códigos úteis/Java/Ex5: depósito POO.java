//Program.java

package application;

import java.util.Scanner;
import java.util.Locale;

import util.Account;

public class Program{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine(); // necessário pois após a inserção de algo antes da string
		String name = sc.nextLine();
		//sc.nextLine();// necessário pois após a inserção de algo antes da string
		System.out.print("Is there an initial deposit (y/n)");
		char option = sc.next().charAt(0);
		
		if(option == 'n') {	
			account = new Account(number, name);
		
		}else{
			System.out.print("Enter initial deposit value: ");
			double initialV = sc.nextDouble();
			
			account = new Account(number, name, initialV);
		}
		
		System.out.println();
		System.out.println("Account data: \n" + account.update());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double valueD = sc.nextDouble();
		account.deposit(valueD);
		System.out.println("Updated Account data: \n" + account.update());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double valueW = sc.nextDouble();
		account.withdraw(valueW);
		System.out.println("Updated Account data: \n" + account.update());
			
		sc.close();
	}
}
//---------------------------------------------------------------------

//Account.java

package util;

public class Account{
	private int number;
	private String name;
	private double total;
	
	public Account(int number, String name, double initialD) {
		this.number = number;
		this.name = name;
		deposit(initialD);
	}
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getTotal() {
		return total;
	}
	
	public double deposit(double valueD) {
		return total += valueD;
	}
	
	public double withdraw(double valueW) {
		return total -= (valueW + 5.00);
	}
	
	public String update() {
		return "Account " +
				number + 
				", " +
				"Holder: " +
				name +
				", " +
				"Balance: $ " +
				String.format("%.2f", total);
	}
	
}
