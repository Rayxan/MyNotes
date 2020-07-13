package application;

import java.util.Scanner;
import java.util.Locale;

public class Program{
	
	public static final double PI = 3.14159; //variável estática
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circunference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circunference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", PI);
		
		sc.close();		
	}
	
	//OBS: Não pode-se chamar um método que não é estático dentro de um método que é estático
	//Dito isso, se tirarmos o método estático das funções abaixo, o programa não funcionará
	public static double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
