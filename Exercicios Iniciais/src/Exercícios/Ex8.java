package Exercícios;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITA UM VALOR: ");
		double value= entrada.nextDouble();
		
		if(value < 12 ) {
			System.out.println("o preço é 1,30");
		} else {
			System.out.println("o preço é 1,00");
		}
		
	}
}
