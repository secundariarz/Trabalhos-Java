package projetodoarielzinho;

import java.util.Scanner;

public class Ex6Rapidinhos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITA O VALOR: ");
		double value = entrada.nextDouble();
		
		while(value > 0) {
			if(value <= 20) {
				double res1 = value * 0.17;
				
			} else if(value >= 21 && value <= 70) {
				double res2 = value * 0.15;
			} else if(value > 70 && value <= 100) {
				double res2 = value * 0.12;
			} else {
				System.out.println("DIGITA O VALOR DO LUCRO: ");
				double DescountValue = entrada.nextDouble();
				
				double DescountRes = DescountValue / 100;
				double DescountResF = value * DescountRes;
				
				System.out.println((value + DescountResF));
			}
		}
		
		if(value < 0) {
			System.out.println("O irmão, digita um numero maior q 1 pelo menos ne");
			
		}
		
	}
}
