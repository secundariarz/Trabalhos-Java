package Exercícios;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITE O VALOR DO CARRO: ");
		double carro = entrada.nextDouble();
		double imposto = carro * 0.45;
		double lucro = carro * 0.12;
		
		
		System.out.println("O valor é: " + (carro + imposto + lucro));
	}
}
