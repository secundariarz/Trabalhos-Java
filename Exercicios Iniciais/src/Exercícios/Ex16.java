package Exercícios;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITA UM VALOR: ");
		int value = entrada.nextInt();
		
		for(int i = 1; i <= value ; i++) {
			if(i % 2 == 0) {
				System.out.println(Math.pow(i, 2));
			}
		}
	}
}
