package POO;

import java.util.Scanner;

public class Universidade {
	public static void main(String[] args) {
		Estudantes student = new Estudantes();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bem vindo ao esquema de faculdade Plus Vip Premium Infinite Evolution Master Blaster");
		System.out.println("Digite a quantidade De estudantes: ");
		student.qEst = entrada.nextInt();
		System.out.println("Digite a primeira nota do semestre: ");
		student.FirstSemGrades = entrada.nextInt();
		System.out.println("Digite a segunda nota do semestre: ");
		student.SecondSemGrades = entrada.nextInt();
		System.out.println("Digite a terceira nota do semestre: ");
		student.TirdSemGrades = entrada.nextInt();
		System.out.println("Digite a quantidade de materias: ");
		student.materias = entrada.nextInt();
		
		
		System.out.println("Perfeito! tudo certo, agora digite os dados dos professores: ");
		Professores prof = new Professores();
		System.out.println("Sua carga horaria: ");
		prof.cargaHoraria = entrada.nextInt();
		System.out.println("Quantidade das materias: ");
		prof.materias = entrada.nextInt();
		
		
		System.out.printf("Temos aqui as informações dos alunos \n A quantidade: %d A primeira nota: %d A segunda: %d A terceira: %d e a quantidade de  materias: %d  E por ultimo: ", student.qEst, student.FirstSemGrades , student.SecondSemGrades , student.TirdSemGrades ,student.materias);
		student.media();
	}
	
} 
