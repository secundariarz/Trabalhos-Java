package Ecommerce;



public class InsertCliente {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Ednaldo pereira");
		cliente.setId(112312);
		cliente.setEndereco("Rua pedrao");
		cliente.setCEP(99709600);
		cliente.setCPF(99709600);
		ClienteDAO dao = new ClienteDAO();
		
		
		dao.add(cliente);
		
		System.out.println("foi");
	}
}
