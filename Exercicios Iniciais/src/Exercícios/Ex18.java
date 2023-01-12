package Exercícios;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int MinusCount = 0;
		int PlusCount = 0;
		
		for(int i = 0; i < 5 ; i++) {
			System.out.println("DIGITA UM VALOR: ");
			double value = entrada.nextInt();
			
			if(value != 0 && value < 0) {
				MinusCount++;
				
			} else if(value != 0 && value > 0) {
				PlusCount++;
			}
			
			
		}
		System.out.println("a quantidade de negativos é " + MinusCount);
		System.out.println("a quantidade de positivos é " + PlusCount);
		
	}
}
