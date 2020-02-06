package br.com.magnasistemas.model;

public class Endereco {
	
	private String longradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private int cep;
	
	public Endereco(String longradouro, int numero, String bairro, String cidade, int cep) {	
		this.longradouro = longradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}
	

	
	public String getLongradouro() {
		return longradouro;
	}
	public void setLongradouro(String longradouro) {
		this.longradouro = longradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	

}
