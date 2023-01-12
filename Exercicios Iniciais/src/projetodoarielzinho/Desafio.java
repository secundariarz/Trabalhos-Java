package projetodoarielzinho;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITA UM VALOR: ");
		double value = entrada.nextDouble();
		
		System.out.println("DIGITA UM SEGUNDO VALOR: ");
		double value2 = entrada.nextDouble();
		
		System.out.printf("o valor da some de %f e %f é %f" ,value, value2, value + value2);
		System.out.printf("\n o valor da some de %f e %f é %f" ,value, value2, value - value2);
		System.out.printf("\n o valor da some de %f e %f é %f" ,value, value2, value * value2);
		System.out.printf("\n o valor da some de %f e %f é %f" ,value, value2, value / value2);
	}
}
