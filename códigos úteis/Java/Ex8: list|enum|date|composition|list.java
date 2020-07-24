//Program.java
package application;

import java.util.Scanner;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Worker;
import entities.enums.WorkerLevel;
import entities.Department;
import entities.HourContract;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		
		System.out.print("Enter month and year to calculate income (MM/YYYY):");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));//passo pra inteiro e pego as posições 0 e 1
		int year = Integer.parseInt(monthAndYear.substring(3)); //passo pra inteiro e pego da posição 3 pra frente
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());//usando o conceito de composição
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		sc.close();
	}
}
//------------------------------------------------------------------------------------------------------------------------------------------

//Worker.java

package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker{
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	//Worker tem 1 Department
	private Department department; 
	
	//1 Worker tem vários Contracts
	private List<HourContract> contracts = new ArrayList<>();
	//Obs: quando houver uma composição "tem muitos", uma lista nesse caso, não é necessário incluir a lista no
	//construtor, pois a lista tem que se iniciar vazia como feito logo acima
	
	public Worker() {
		
	}
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContract() {
		return contracts;
	}
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH); // +1 pois o calendário começa com 0
			if(month == c_month && year == c_year) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------

//WorkerLevel.java

package entities.enums;

public enum WorkerLevel{
	JUNIOR,
	MID_LEVEL,
	SENIOR;
}

//------------------------------------------------------------------------------------------------------------------------------------------

//HourContract.java
package entities;

import java.util.Date;

public class HourContract{
		private Date date;
		private	Double valuePerHour;
		private Integer hours;
		
		public HourContract() {
			
		}
		
		public HourContract(Date date, Double valuePerHour, Integer hours) {
			this.date = date;
			this.valuePerHour = valuePerHour;
			this.hours = hours;
		}
		
		public Date getDate() {
			return date;
		}
		
		public void setDate(Date date) {
			this.date = date;
		}
		
		public Double getValuePerHour() {
			return valuePerHour;
		}
		
		public void setValuePerHour(Double valuePerHour) {
			this.valuePerHour = valuePerHour;
		}
		
		public Integer getHours() {
			return hours;
		}
		
		public void setHours(Integer hours) {
			this.hours = hours;
		}
		
		//Aqui é aplicado o conceito de delegação
		//Por que a função totalValue não fica diretamente na classe Worker?
		//Pois as classes tem papéis únicos no sistema e não podem realizar todas as funções
		//Isso é feito pra tornar o código mais sucetível a correções e mais refatorado
		public Double totalValue() {
			return valuePerHour * hours;
		}
}

//------------------------------------------------------------------------------------------------------------------------------------------

//Department.java

package entities;

public class Department{
	private String name;
	
	public Department() {
		
	}
	
	public Department(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	} 
	
	public void setName(String name) {
		this.name = name;
	}
}

