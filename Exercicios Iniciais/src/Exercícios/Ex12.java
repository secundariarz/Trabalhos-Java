package Exercícios;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITA UM VALOR: ");
		double value = entrada.nextDouble();
		
		System.out.println("DIGITA UM VALOR: ");
		double value2 = entrada.nextDouble();
		
		

		if(value != 0) {
			System.out.println(value / value2);
		} else {
			System.out.println("Divisão por 0");
		}
	}
}
