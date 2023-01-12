package Exercícios;


import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITA UM VALOR: ");
		double value = entrada.nextDouble();
		
		System.out.println("DIGITA UM VALOR: ");
		double value2 = entrada.nextDouble();
		
		if(value > value2) {
			System.out.println("O primeiro valor é maior");
		} else if(value2 > value) {
			System.out.println("O segundo valor é maior");
		} else if(value == value2) {
			System.out.println("São iguais");
		}
		
	}
}
