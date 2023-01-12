package Funcionario;

public class employee {
	int carga;
	String nome;
	String sobrenome;
	String periodo;
	String setor;
	String cargo;
	String sexo;
	String contratacao;
	String dataContratacao;
	boolean ativo;
	double salario;
	double aumento;
	
	private String cpf;
	private String rg;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void bonifica(double aumento) {
		double res = salario + aumento;
		System.out.println("O salario com a bonificacao é: " + res);
	}

	public void demite() {
		if(ativo == true) {
			ativo = false;
		}
		
		System.out.println("VocÊ foi demitido");
	}
}

