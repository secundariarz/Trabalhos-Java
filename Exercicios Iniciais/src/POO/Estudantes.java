package POO;

public class Estudantes {
	int qEst;
	int materias;
	int FirstSemGrades;
	int SecondSemGrades;
	int TirdSemGrades; 
	
	public void media() {
		int media = (FirstSemGrades + SecondSemGrades + TirdSemGrades / 3);
		if(media > 7) {
			System.out.println("aluno aprovado");
		} else {
			System.out.println("Aluno em recuperação");
		}
	}
}
