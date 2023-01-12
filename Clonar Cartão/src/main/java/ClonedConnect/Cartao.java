package ClonedConnect;

import java.util.Calendar;

public class Cartao {
	private int numero;
	private String nome;
	private int cvv;
	private Calendar validade;
	private String txtNome;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public Calendar getValidade() {
		return validade;
	}
	public void setValidade(Calendar validade) {
		this.validade = validade;
	}
	public String getTxtNome() {
		return txtNome;
	}
	public void setTxtNome(String txtNome) {
		this.txtNome = txtNome;
	}
}
