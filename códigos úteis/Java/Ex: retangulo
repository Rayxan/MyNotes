//Program.java
package exercise;

import java.util.Scanner;
import java.util.Locale;

import entities.Retangulo;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo(); 
		
		System.out.println("Enter rectangle width and height:");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		
//		System.out.println("AREA: " + String.format("%.2f",retangulo.area()));
//		System.out.println("PERIMETER: " + String.format("%.2f",retangulo.per()));
//		System.out.println("DIAGONAL: " + String.format("%.2f",retangulo.diag()));
		
		System.out.println(retangulo.print());
		
		sc.close();
	}
}

//----------------------------------------------------------------------------------------------------------------

//Retangulo.java

package entities;

public class Retangulo {
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double per() {
		return 2*(width + height);
	}
	
	public double diag() {
		return Math.sqrt((width*width)+ (height*height));
	}
	
	public String print() {
		return "AREA: " + String.format("%.2f",area()) + "\n" + 
		"PERIMETER: " + String.format("%.2f",per()) + "\n" +
		"DIAGONAL: " + String.format("%.2f",diag());
	}
}
