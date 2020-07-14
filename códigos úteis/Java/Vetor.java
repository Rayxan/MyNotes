package application;

import java.util.Scanner;
import java.util.Locale;

public class Program{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma=0;
		int n;
		
		n = sc.nextInt();
		
		double[] vect = new double[n];//declarar vetor em java
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		System.out.println("AVAREGE HEIGHT = " + String.format("%.2f",soma/n));
		sc.close();
		
	}
}
