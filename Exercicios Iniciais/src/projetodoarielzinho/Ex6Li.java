package projetodoarielzinho;

import java.util.Scanner;

public class Ex6Li {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITA O NUM DA CONTA: ");
		double conta = entrada.nextDouble();
		
		System.out.println("DIGITA O NUM DO CLIENTE: ");
		double cliente = entrada.nextDouble();
		
		System.out.println("DIGITA O SALDO: ");
		double saldo = entrada.nextDouble();
		
		System.out.println("DIGITA O DÉBITO: ");
		double debito = entrada.nextDouble();
		
		System.out.println("DIGITA O CREDITO: ");
		double credito = entrada.nextDouble();
		
		
		double atual = saldo - debito + credito;
		
		if(atual >= 0) {
			System.out.println("Saldo positivo");
		} else {
			System.out.println("Saldo negativo");
		}
	}
}
