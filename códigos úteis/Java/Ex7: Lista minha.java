//Essa foi a forma que eu encontrei para fazer a questão, porém não é a mais indicada pra resolver esse tipo de problema da questão (ver forma do professor)

//Program.java
package course;

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

import entities.Funcionario;

public class Program{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("How many employees will be registred? ");
		int n = sc.nextInt();
		
		Funcionario[] vect = new Funcionario[10000];//vetor de funcionários 
		
		List<Integer> list = new ArrayList<>();//Declara uma lista e instancia-a
		
		
		for(int i=1;i<=n;i++) {
			System.out.printf("Employee #%d\n",i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();//pois há inserção de valores antes da String
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			vect[id] = new Funcionario(name,salary);
			
			list.add(id);
			
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		if(list.indexOf(id) == -1) {
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			double per = sc.nextDouble();
			
			vect[id].increaseSalary(per); 
		}
		
		System.out.println();
		
		System.out.println("List of employees: ");
		for(Integer x : list) {
			System.out.print(x);
			
			System.out.println(", " + vect[x].toString());
		}
		
		sc.close();
	}
}

//Funcionario.java

package entities;

public class Funcionario{
	//private int id;
	private String name;
	private double salary;
	
	public Funcionario(String name, double salary) {
		
		this.name = name;
		this.salary = salary;
	}
	
//	public int getId() {
//		return id;
//	}
//	
//	public void setId(int id) {
//		this.id = id;
//	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double per) {
		setSalary(salary + (salary*(per/100))); 
	}
	
	public String toString() {
		return 	name +
				", " +
				String.format("%.2f", salary);
	}
	
}
