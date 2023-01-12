package Exercícios;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITA O NUM ");
		double value = entrada.nextDouble();
		int a = 0;
		int b = 1;
		int d = 0;
		int soma = 0;
		
		
		
		for(int i = 0 ; i <= value; i++) {
			a = a + b; // 1
			b = b + d; // 1
			d = b + a; // 1
			soma += b;
			System.out.println(a +" " +  b);
		}
		
		System.out.println();
	}
}
