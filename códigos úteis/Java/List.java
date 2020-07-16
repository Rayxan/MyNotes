package application;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Program{
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();//Declaração e instancação de uma lista
		
		list.add("Jojo");
		list.add("Narantia");
		list.add("Dio");
		list.add("Jotaro");
		list.add("Killua");
		list.add("Kaka");
		
		list.add(2, "Gon");
		
		list.remove("Dio");
		list.remove(1);
		
		System.out.println(list.size());
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'J');//Predicado: definindo uma função lambda (função que retorna v ou f)
		//Pega um valor x do tipo string e me retorna se esse valor é igual a 'J'
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------");
		
		System.out.println("Index of Killua: " + list.indexOf("Killua"));
		System.out.println("Index of Jotaro: " + list.indexOf("Jotaro"));//-1 por não está na lista
		System.out.println("---------------------------------------");
		
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'K').collect(Collectors.toList());
		//tipo stream é um tipo que aceita operações com expressões lambda
		//como o stream não é compatível com a lista, ele tem que ser convertido pra lista com o collect
		//filter(x -> x.charAt(0) == 'K') isso faz a procura de todos os x que começam com 'K'
		
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------");
		
		
		//Encontrar o primeiro elemento com tal letra
		String name = list.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null);
		System.out.println(name);
		
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name2);
	}
}
