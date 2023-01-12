package projetodoarielzinho;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITA O NOME: ");
		String nome = entrada.nextLine();
		
		
		int age = entrada.nextInt();
		
		System.out.printf("teu nome é %s e seu idade é %d" , nome , age);
		
		entrada.close();
	}
	
}
