package Jogador;

import java.util.Scanner;

public class ShowPlayer {
	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		joj player = new joj();
		
		System.out.println("Digite o nome");
		player.nome = entrada.nextLine();
		System.out.println("Digite a nacionalidade");
		player.nac = entrada.nextLine();
		System.out.println("Digite a posição");
		player.pos = entrada.nextLine();
		System.out.println("Digite a altura");
		player.altura = entrada.nextDouble();
		System.out.println("Digite o peso");
		player.peso = entrada.nextDouble();
		System.out.println("Digite o nascimento");
		player.nascimento = entrada.nextDouble();
		
		
		player.calc();
	}
}
