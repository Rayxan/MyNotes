import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1,s2,s3;
		char letra;
		
		x = sc.nextInt();
		sc.nextLine(); // necessário pois após a inserção do inteiro, a quebra de linha fica pendente na entrada padrão
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		letra = sc.next().charAt(0);
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(letra);
		
		sc.close();
	}
}
