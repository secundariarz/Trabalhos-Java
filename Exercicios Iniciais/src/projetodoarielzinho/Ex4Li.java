package projetodoarielzinho;

import java.util.Scanner;

public class Ex4Li {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITE UM NUMERO: ");
		double atual = entrada.nextDouble();
		int count = 0;
		
		for(int i = 1 ; i <= atual; i++) {
			
			if(atual % i == 0) {
				count++;		
			} 
			
		}
		if(count == 2) {
			System.out.println("primo!");
		} else {
			System.out.println("não é");

		
		}
		
	}
}
