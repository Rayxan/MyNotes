public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //um objeto do tipo Scanner (associa a variável sc a entrada de dados padrão do java)
		
		int x,y;
		
		x = sc.nextInt(); //inserir um inteiro
		y = sc.nextInt();
		
		int soma = x+y;
		
		System.out.printf("X = %d\n ", soma);

		
		sc.close(); //funcao que delacoca o que criamos
	}
}
