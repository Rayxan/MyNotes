//Program.java

package application;

public class Program{
	public static void main(String[] args) {
		
		int x =20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		int y = (int) obj; //necessário de um casting pois obj é do tipo Object
		
		System.out.println(y);
		
		System.out.println("-----------------------------------------------");
		
		//Mesmo exemplo, mas sem uso de casting, e com o uso das Wrapper Classes
		//Wrapper Classes : são classes que tem o objetivo de tratar os tipos primitivos comoclasses
		//só que de uma forma transparente ao compilador, sem precisar fazer conversões ou castings
		int x1 =20;
		
		Integer obj1 = x1; // Integer é uma weapper class (tipo class)
		
		System.out.println(obj1);
		
		int y1 = obj1; //necessário de um casting pois obj é do tipo Object
		
		System.out.println(y1);
	}
}
