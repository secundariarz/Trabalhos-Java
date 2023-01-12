package projetodoarielzinho;

import java.util.Scanner;

public class Ex2Lu {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("DIGITE UM NUMERO: ");
		double num = entrada.nextDouble();
		
		
		if(num % 4 == 0 && num % 400 == 0) {
			System.out.println("Bissexto");
		} else if(num % 4 == 0 && num % 100 == 0) { 
			System.out.println("Não é");
		}
		
	}
}
