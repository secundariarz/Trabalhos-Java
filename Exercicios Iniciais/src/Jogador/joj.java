package Jogador;


public class joj {
	String nome;
	String pos;
	double nascimento;
	String nac;
	double altura;
	double peso;
	
	public void calc() {
		
		double res = (nascimento - 2022);
		
		if(pos == "defesa" && res >= 40) {
			System.out.println("aposentado");
		} else if(pos == "meio-campo" && res >= 38) {
			System.out.println("aposentado");
		} else if( pos == "atacante" && res >= 35) {
			System.out.println("aposentado");
		} else {
			System.out.println("jogando");
		}
		
		System.out.println(nome);
 		System.out.println(pos);
 		System.out.println(nascimento);
 		System.out.println(nac);
 		System.out.println(altura);
 		System.out.println(peso);
 		
	}
}
