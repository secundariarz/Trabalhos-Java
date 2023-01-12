package Ecommerce;

public class Itens {

	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String string) {
		this.quantidade = string;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String i) {
		this.validade = i;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	private String nome;
	private String quantidade;
	private String validade;
	private double preço;
	private int tamanho;
	private String codigo;
	public void add(Itens itens) {
		// TODO Auto-generated method stub
		
	}
	
}
