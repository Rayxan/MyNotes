//Em program.java

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();//Instanciacao de objetos
		y = new Triangle();
		
		System.out.println("Enter the mesures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the mesures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area(); // chamada do metodo
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle X area: %.4f\n", areaY);
		
		if(areaX > areaY)
			System.out.println("Larger area: X");
		else
			System.out.println("Larger area: Y");
		
		sc.close();
	}

}

//-------------------------------------------------------------------------------------------------

//Em Triangle.Java

package entities;

public class Triangle {
	//Atributos:
	public double a;
	public double b;
	public double c;
	
	//Metodo:
	public double area() {
		double p =(a + b + c)/2.0;
		return Math.sqrt(p * (p-a) * (p-b) * (p-c));
	}
	
}
