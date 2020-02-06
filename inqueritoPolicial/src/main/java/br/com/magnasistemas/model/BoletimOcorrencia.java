package br.com.magnasistemas.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BoletimOcorrencia {
//dados sobre o boletim		
	@Id	
	private Integer idBoletim;	
	private LocalDateTime dataHoraBoletim;
	private Endereco origem;
	private Delegado delegado;
	private Delegacia delegacia;
	
//Dados sobre o ocorrido
	private LocalDateTime dataHoraFimRegistro;
	private LocalDateTime dataHoraFato;
	private Endereco localOcorrido;
	
	
	public int getIdBoletim() {
		return idBoletim;
	}
	public void setIdBoletim(int idBoletim) {
		this.idBoletim = idBoletim;
	}
	public LocalDateTime getDataHoraBoletim() {
		return dataHoraBoletim;
	}
	public void setDataHoraBoletim(LocalDateTime dataHoraBoletim) {
		this.dataHoraBoletim = dataHoraBoletim;
	}
	public Endereco getOrigem() {
		return origem;
	}
	public void setOrigem(Endereco origem) {
		this.origem = origem;
	}
	public Delegado getDelegado() {
		return delegado;
	}
	public void setDelegado(Delegado responsavel) {
		this.delegado = responsavel;
	}
	public LocalDateTime getDataHoraFimRegistro() {
		return dataHoraFimRegistro;
	}
	public void setDataHoraFimRegistro(LocalDateTime dataHoraFimRegistro) {
		this.dataHoraFimRegistro = dataHoraFimRegistro;
	}
	public Delegacia getDelegacia() {
		return delegacia;
	}
	public void setDelegacia(Delegacia delegacia) {
		this.delegacia = delegacia;
	}
	public LocalDateTime getDataHoraDoFato() {
		return dataHoraFato;
	}
	public void setDataHoraDoFato(LocalDateTime dataHoraDoFato) {
		this.dataHoraFato = dataHoraDoFato;
	}
	public Endereco getLocalOcorrido() {
		return localOcorrido;
	}
	public void setLocalOcorrido(Endereco localOcorrido) {
		this.localOcorrido = localOcorrido;
	}
	
}
