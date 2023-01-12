package Exercícios;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITA UM VALOR: ");
		double value= entrada.nextDouble();
		
		if(value > 0) {
			System.out.println("é positivo");
		} else {
			System.out.println("nenao");
		}
	}
}
