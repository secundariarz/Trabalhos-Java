package projetodoarielzinho;

import java.util.Scanner;

public class Ex2Li {
	public static void main(String[] args) {
		int soma = 0;
		int count = 0;
		for(int i = 13; i <= 73; i++) {
			if(i % 2 == 0) {
				soma = soma + i;
				count++;
				
			}
		}
		System.out.println(soma / count);
	}
}
