package Doguinho;

import java.util.Scanner;

public class PassosCachorros {
	public static void main(String[] args) {
		Cachorro bulldog = new Cachorro();
		bulldog.qntPatas = 4;
		bulldog.qntOrelhas = 2;
		bulldog.rabo = 1;
		bulldog.nomeDono = "Enzo";
		bulldog.qntPassos = 1;
		bulldog.disposicao = 1;
		
		System.out.println("Digita o nome do dog e veja se ele está disposto");
		Scanner entrada = new Scanner(System.in);

		bulldog.nome = entrada.nextLine();
		bulldog.correr();
		
		
		
		
	}
	
}

