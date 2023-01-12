package Pessoas;

public class people {
	String nome;
	int nasc;
	String email;
	
	
	public void age() {
		int res = (nasc - 2022);
		if(res > 17) {
			System.out.println("Maior que 17");
		} else {
			System.out.println("Menor");
		}
	}
}
