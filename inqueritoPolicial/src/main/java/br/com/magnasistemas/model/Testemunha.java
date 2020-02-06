package br.com.magnasistemas.model;

import javax.persistence.Entity;

@Entity
public class Testemunha extends Pessoa{
	
	private String profissao;

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
