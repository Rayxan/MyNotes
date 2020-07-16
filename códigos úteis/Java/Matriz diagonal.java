//Program.java 

package application;

import java.util.Scanner;

public class Program{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		int i,j,neg=0;
		
		for(i=0;i<mat.length;i++) {
			for(j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
				if(mat[i][j] < 0)
					neg++;
			}
		}
		
		System.out.print("Main Diagonal:\n");
		
		for(i=0;i<mat.length;i++) {
			System.out.print(" " + mat[i][i]);
		}
		
		System.out.println();
		System.out.print("Negative numbers = " + neg);
		
		sc.close();
	}
}
