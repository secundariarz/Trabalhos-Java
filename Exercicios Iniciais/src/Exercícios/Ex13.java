package Exercícios;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITA O PRIMEIRO: ");
		int value = entrada.nextInt();
		
		System.out.println("DIGITA O SEGUNDO: ");
		int value2 = entrada.nextInt();
		
		System.out.println("DIGITA O TERCEIRO: ");
		int value3 = entrada.nextInt();
		
	
			if(value > value2 && value > value3) {
				System.out.printf("%d %d %d" , value , value2 , value3);
			} else if(value > value2 && value < value3) {
				System.out.printf("%d %d %d" , value2, value , value3);
			} else if(value < value2 && value > value3) { //
				System.out.printf("%d %d %d" , value3, value2, value);
			} else if(value2 > value && value2 > value3) {
				System.out.printf("%d %d %d" , value2, value, value3);
			} else if(value2 < value && value2 > value3) {
				System.out.printf("%d %d %d" , value, value2, value3);
			} else if(value2 < value && value2 > value3) {
				System.out.printf("%d %d %d" , value3,value2, value);
			} else if(value3 > value2 && value3 > value) {
				System.out.printf("%d %d %d" , value3, value2 , value);				
			} else if(value3 > value2 && value3 < value) {
				System.out.printf("%d %d %d" , value2, value3, value);
			} else if(value3 < value2 && value3 >value) {
				System.out.printf("%d %d %d" , value2, value3, value);
			}
				
		
		
		
	}
	
	
}
