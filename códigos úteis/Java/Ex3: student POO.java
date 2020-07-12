//Program.java
package exercise;

import java.util.Scanner;

import entities.Aluno;

import java.util.Locale;

public class Program{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno student = new Aluno();
		
		student.name = sc.nextLine();
		student.nota[0] = sc.nextDouble();
		student.nota[1] = sc.nextDouble();
		student.nota[2] = sc.nextDouble();
		
		
		System.out.println(student.soma());
		
		sc.close();
	}
}

//Aluno.java

package entities;

public class Aluno{
	public String name;
	public double[] nota = new double[3];//declaração de um vetor de 3 posições
	
	public String soma() {
			double soma = (nota[0] + nota[1] + nota[2]);
			
			if(soma >=60) {
				return "FINAL GRADE = " +
						String.format("%.2f", soma) +
						"\n" +
						"PASS";
			}else
				return "FINAL GRADE = " +
						String.format("%.2f", soma) +
						"\n" +
						"FAILED" + 
						"\n" +
						"MISSING " +
						(60-soma) +
						" POINTS";
	}
}

