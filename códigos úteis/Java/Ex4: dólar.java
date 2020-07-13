//Program.java

package application;

import java.util.Scanner;
import java.util.Locale;

import util.CurrencyConverter;

public class Program{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the price? ");
		double p = sc.nextDouble();
		
		System.out.print("How many dolars will be bought? ");
		double v =  sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + 
		String.format("%.2f",CurrencyConverter.Calculator(p,v)));
		
		sc.close();
	}
}
//---------------------------------------

//CurrencyConverter.java

package util;

public class CurrencyConverter{
	public static double IOF = 0.06;
	
	public static double Calculator(double price, double valor){
		return price * valor *(1.0 + IOF);
	}
}
