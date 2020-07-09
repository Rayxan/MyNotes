import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//int mask = 32;
		int mask = 0b100000;
		
		if((n & mask) != 0) 
			System.out.println("6th bit is true!");
		else
			System.out.println("th bit is false!");

	
	sc.close();
	}
}

/*teste com 32
obs 32 = 0010 0000
*/
