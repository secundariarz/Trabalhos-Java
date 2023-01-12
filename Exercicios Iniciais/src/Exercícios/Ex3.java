package Exercícios;

import java.util.Scanner;

public class Ex3 {
 public static void main(String[] args) {
	 	Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITA O RAIO: ");
		double Raio = entrada.nextDouble();
		
		System.out.println("DIGITA A ALTURA: ");
		double Altura = entrada.nextDouble();

		System.out.println("Seu volume é: " + 3.14 * (Raio * Raio) * Altura);
		System.out.println("Sua superfície é: " + ((2 * 3.14) * Raio * Altura + (2 * 3.14) * (Raio * Raio)));
}
}