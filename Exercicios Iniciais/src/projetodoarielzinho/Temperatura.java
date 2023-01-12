package projetodoarielzinho;

public class Temperatura {
	public static void main(String[] args) {
		int fahrenheit = 12;
		final double count = 32;
		final double count2 = 5.0/9;
		double c = (fahrenheit - count) * count2;
		
		System.out.println(c);
	}
}
