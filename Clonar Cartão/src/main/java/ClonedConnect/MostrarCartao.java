package ClonedConnect;

public class MostrarCartao  {
	private void btnConsultarActionPerformed(final java.awt.event.ActionEvent evt) {
		String nomeTitular;
		CartaoDao dao = new CartaoDao();
		Cartao teste = new Cartao();
		nomeTitular = teste.getTxtNome();
		
		
		
		
		dao.consulta(nomeTitular);
		teste.setNome(nomeTitular);
	}

}


