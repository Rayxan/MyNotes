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
//-----------------------------------------------------------------------------------------------------------------------
//Mesmo exemplo utilizando métodos no lugar de funções estáticas

//Program.java
package application;

import java.util.Scanner;
import java.util.Locale;

import util.Calculator;

public class Program{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculator calc = new Calculator();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circunference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circunference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", calc.PI);
		
		sc.close();		
	}
}

//Calculator.java

package util;

public class Calculator {
	public final double PI = 3.14159; //variável estática
	
	public double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}

//-------------------------------------------------------------------------------
//Mesme exemplo mas agora com métodos estáticos
//obs: com métodos estáticos não é preciso instanciar a classe, basta usar o nome da classe na frente do método ou variável estática ao serem utilizados

//Program.java

package application;

import java.util.Scanner;
import java.util.Locale;

import util.Calculator;

public class Program{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circunference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circunference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", Calculator.PI);
		
		sc.close();		
	}
}

//Calculator.java

package util;

public class Calculator {
	public static double PI = 3.14159;
	
	public static double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}


