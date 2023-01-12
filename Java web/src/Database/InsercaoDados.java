package Database;

import java.util.Calendar;
import java.util.List;

public class InsercaoDados {
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Ana");
		contato.setEmail("ain@gmail.com");
		contato.setEndereco("Rua italia23i4");
		contato.setDataNascimento(Calendar.getInstance());
		
		Contato contato2 = new Contato();
		contato2.setNome("Ariel");
		contato2.setEmail("arielrigozonta@gmail.com");
		contato2.setEndereco("Rua it");
		contato2.setDataNascimento(Calendar.getInstance());
		contato2.setId(3l);
		//ContatoDao dao = new ContatoDao();
		
		Contato contato3 = new Contato();
		contato3.setNome("aleki");
		contato3.setEmail("aleki@gmail.com");
		contato3.setEndereco("Rua i4444444t");
		contato3.setDataNascimento(Calendar.getInstance());
		contato3.setId(4l);
//		ContatoDao dao3 = new ContatoDao();
//		
		Contato contato4 = new Contato();
		contato4.setNome("chompa");
		contato4.setEmail("asdasdasdas@gmail.com");
		contato4.setEndereco("Rua it123123");
		contato4.setDataNascimento(Calendar.getInstance());
		contato4.setId(5l);
//		ContatoDao dao4 = new ContatoDao();
		
		Contato contato5 = new Contato();
		contato5.setNome("nobru");
		contato5.setEmail("nobru@gmail.com");
		contato5.setEndereco("Rua do frifaire 3000");
		contato5.setDataNascimento(Calendar.getInstance());
		contato5.setId(6l);
//		ContatoDao dao5 = new ContatoDao();
		
	


		  
		  System.out.println("Gravado!");
		  System.out.println("fOI DENVOO");
	}
}
