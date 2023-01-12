package Doguinho;

public class Cachorro {
	int qntPatas;
	int qntOrelhas;
	int qntPassos;
	int rabo;
	int disposicao;
	String nome;
	String nomeDono;
	
	public void correr() {
		
		if(disposicao == 1) {
		for(int i = 1; i < 50; i++) {
				qntPassos++;
			}
		}
			System.out.printf("Seu doguinho está disposto, a quantidade de passos que ele deu é: %d", qntPassos);
		}
		
}
