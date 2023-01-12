package Exercícios;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITA A PRIMEIRA NOTA: ");
		double Nota1 = entrada.nextDouble();
		
		System.out.println("DIGITA A SEGUNDA: ");
		double Nota2 = entrada.nextDouble();
		
		double res = (Nota1 + Nota2) / 2;
		
		if(res > 6) {
			System.out.println("aluno aprovado");
		} else {
			System.out.println("aluno reprovado");
		}

	}
}
