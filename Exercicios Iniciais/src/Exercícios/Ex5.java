package Exercícios;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITA UM VALOR: ");
		double produto = entrada.nextDouble();
		
		System.out.println("DIGITA UM SEGUNDO VALOR: ");
		double lucro = entrada.nextDouble();
		
		
		double res = (produto * lucro) / 100;
		
		
		System.out.println("Seu prdouto custará: " + (produto + res));
	}
	
}
