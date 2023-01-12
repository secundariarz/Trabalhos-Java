package Ecommerce;

public class InsertItens {
	

	public static void main(String[] args) {
		Itens Itens = new Itens();
		Itens.setNome("Rtx 4080");
		Itens.setId(112312);
		Itens.setQuantidade("14");
		Itens.setValidade("16/10");
		Itens.setPreço(99709600);
		Itens dao = new Itens();
		
		
		dao.add(Itens);
		
		System.out.println("foi");
}
}