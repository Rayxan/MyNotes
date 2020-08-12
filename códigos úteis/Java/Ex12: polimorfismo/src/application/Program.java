package application;

import java.util.Scanner;
import java.util.Locale;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Product;
import entities.ImportedProduct;
import entities.UsedProduct;

public class Program{
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Praduct #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char op = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();	//pega a quebra de linha
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(op == 'i') {
				System.out.print("Custom fee: ");
				double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
				
			}else if(op == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufactureDate));
			}else
				list.add(new Product(name, price));
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:\n");
		
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}
}