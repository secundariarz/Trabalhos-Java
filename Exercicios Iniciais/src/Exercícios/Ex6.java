package Exercícios;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITA UM VALOR: ");
		double value= entrada.nextDouble();
		
		if(value > 10) {
			System.out.println("é maior uau");
		} else {
			System.out.println("nénão");
		}
 	}
	
}
