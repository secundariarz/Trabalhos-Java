package Database;

import java.util.List;

public class ListarFunc {
		public static void main(String[] args) {
			funcionarioDAO dao = new funcionarioDAO();
			List<Funcionario> funcionarios = dao.getLista();
			for (Funcionario funcionario : funcionarios) {
				System.out.println("Nome: " + funcionario.getNome());
				System.out.println("Email: " + funcionario.getPass());
				System.out.println("Endereço: " + funcionario.getUser());
			}
		}
	

}
