package projetodoarielzinho;

public class Logicos {
	public static void main(String[] args) {
		System.out.println("Tabela Verdade E (AND)");
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("Tabela Verdade OU (OR)");
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("Tabela Verdade NOT");
		
		System.out.println(!true);
		System.out.println(!false);
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(29 > 30);
		System.out.println(30 > 29);
		System.out.println(89 >= 89);
		System.out.println(29 <= 30);
		System.out.println(29 != 30);
	}
}
