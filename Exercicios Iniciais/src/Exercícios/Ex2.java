package Exercícios;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITA UM VALOR: ");
		double value = entrada.nextDouble();
		
		System.out.println("DIGITA UM SEGUNDO VALOR: ");
		double value2 = entrada.nextDouble();
		
		double res = value / value2;
		double resRest = value % value2;
		
		System.out.println(res);
		System.out.println(resRest);
	}
}
