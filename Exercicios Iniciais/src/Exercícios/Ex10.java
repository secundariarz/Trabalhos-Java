package Exercícios;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITA UM VALOR: ");
		double value = entrada.nextDouble();
		
		System.out.println("DIGITA UM VALOR: ");
		double value2 = entrada.nextDouble();
		
		System.out.println("DIGITA UM VALOR: ");
		double value3 = entrada.nextDouble();
		
		double res = value2 + value3;
		
		if(value > res) {
			System.out.println("ele é maior");
		} else {
			System.out.println("né não");
		}
		
	}
}
