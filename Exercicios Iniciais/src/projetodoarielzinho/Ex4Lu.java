package projetodoarielzinho;

import java.util.Scanner;

public class Ex4Lu {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int count = 0;
		double media = 0;
		for(int i = 0; i <= 5; i++) {
			System.out.println("DIGITE UM NUMERO: ");
			double num = entrada.nextDouble();
			count++;
			media += num;

		}
		System.out.println((media / count));
		
	}
}
