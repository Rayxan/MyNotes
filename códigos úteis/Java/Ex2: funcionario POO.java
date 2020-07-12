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

Funcionario.Java

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
