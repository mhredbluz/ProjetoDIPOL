package br.com.magnasistemas.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Delegacia {
	
	@Id
	private int dp;
	private String nome;
	private Endereco endereco;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

}
