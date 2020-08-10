package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program{
	public static void main(String[] args) {
		Account acc = new Account(12, "JOJO", 1000.0);
		BusinessAccount bacc = new BusinessAccount(25, "Dio", 0.0, 500.0);
		
		//UPCASTING (Converte da subclasse pra superclasse)
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(24, "Jotaro", 58.0, 258.0);
		Account acc3 = new SavingsAccount(58, "momo", 58.0, 700.0);
		
		//DOWNCASTING (Converte da superclasse pra subclasse)
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.00);
		
//		BusinessAccount acc5 = (BusinessAccount)acc3; 
		//O compilador vai identificar o erro em tempo de execução, 
		//pois a SavingsAccount é uma Account mas não é uma BusinesAccount
		
		//Evitando o erro acima
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}