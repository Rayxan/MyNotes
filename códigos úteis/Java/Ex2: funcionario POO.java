//Program.java

package exercise;

import java.util.Scanner;
import java.util.Locale;

import entities.Funcionario;

public class Program{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println(funcionario.print1());
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double per = sc.nextDouble();
		funcionario.increaseSalary(per);
		
		System.out.println();
		System.out.println(funcionario.print2());
		
		sc.close();
	}
}

//------------------------------------------------------------------------------------------------

//Funcionario.java

package entities;

public class Funcionario{
	public String name;
	public double grossSalary;
	public double tax;
	
	public double liqSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percent) {
		grossSalary = (grossSalary-tax)+ (grossSalary * (percent/100));
	}
	
	public String print1() {
		return "Employee: "+
			name + ", $"+
			String.format("%.2f",liqSalary());
	}
	
	public String print2() {
		return "Updated data: "+ 
			name +", $" +
			String.format("%.2f",grossSalary);
	}
}
