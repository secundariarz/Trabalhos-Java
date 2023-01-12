package Funcionario;



public class showEmployee {
	
	
	public static void main(String[] args) {
		employee func = new employee();
		
		
		func.carga = 8;
		func.nome = "Claudio";
		func.sobrenome = "Trucado";
		func.periodo = "Tarde / Noite";
		func.setor = "Ti";
		func.cargo = "Dev Front-End";
		func.sexo = "Masculino";
		func.contratacao = "CLT";
		func.dataContratacao = "10/10/20";
		func.ativo = true;
		func.salario = 1000;
		func.setCpf("102301232");
		func.setRg("0041203012321");
		
		System.out.println(func.getCpf());
		System.out.println(func.getRg());
		
		func.bonifica(func.salario * 0.10);
		
		func.demite();
	
	}
}