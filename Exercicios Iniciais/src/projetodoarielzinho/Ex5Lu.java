package projetodoarielzinho;

import java.util.Scanner;

public class Ex5Lu {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("DIGITE A BASE: ");
		double base = entrada.nextDouble();
		
		System.out.println("DIGITE A ALTURA: ");
		double altura = entrada.nextDouble();
		
		System.out.println("a area é " + (base * altura));
		System.out.println("o perimetro é " + (base + altura) * (base + altura));
	}
}
