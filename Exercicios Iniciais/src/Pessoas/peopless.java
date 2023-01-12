package Pessoas;

import java.util.Scanner;

public class peopless {
	public static void main(String[] args) {
		people peo = new people();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome");
		peo.nome = entrada.nextLine();
		System.out.println("Digite o email");
		peo.email = entrada.nextLine();
		System.out.println("Digite a data");
		peo.nasc = entrada.nextInt();
		
		
		
		peo.age();
	}
	
}
