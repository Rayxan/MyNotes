package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program{
	public static void main(String[] args) {
		Account acc1 = new Account(1, "Raylan", 2000.0);
		acc1.withdraw(200);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(2, "Paulo", 2000.0, 0.01);
		acc2.withdraw(200);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(3, "Sarany", 2000.0, 2000.0);
		acc3.withdraw(200);
		System.out.println(acc3.getBalance());
	}
}