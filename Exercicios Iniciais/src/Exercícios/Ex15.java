package Exercícios;

import java.util.Scanner;

public class Ex15 {
 public static void main(String[] args) {
	 	Scanner entrada = new Scanner(System.in);
		
		
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("DIGITA UM VALOR: ");
			double value = entrada.nextDouble();
			
			if(value % 2 == 0) {
				System.out.println(value);
			}
		}
}
}
