package Database;

public class InsertFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Ednaldo pereira");
		funcionario.setId(1l);
		funcionario.setPass(12345);
		funcionario.setUser("Mano E.D");
		funcionarioDAO dao = new funcionarioDAO();
		
		
		dao.add(funcionario);
		
		System.out.println("foi");
	}
}
