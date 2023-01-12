package Exercícios;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITA UM VALOR: ");
		double value = entrada.nextDouble();
		
		for(int i = 1; i <= 10000 ; i++) {
			if(i % value == 2) {
				System.out.println(i);
			}
		}
	}
}
