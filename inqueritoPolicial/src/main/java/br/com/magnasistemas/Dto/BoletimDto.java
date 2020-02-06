package br.com.magnasistemas.Dto;

import java.time.LocalDateTime;

import br.com.magnasistemas.model.BoletimOcorrencia;
import br.com.magnasistemas.model.Delegacia;
import br.com.magnasistemas.model.Delegado;

public class BoletimDto {
	
	private Integer idBoletim;
	private Delegado delegado;
	private Delegacia delegacia;
	private LocalDateTime dataHoraFato;
	private LocalDateTime dataHoraBoletim;
	private LocalDateTime dataHoraFimRegistro;
	
	public BoletimDto(BoletimOcorrencia boletimOcorrencia) {

		this.idBoletim = boletimOcorrencia.getIdBoletim();
		this.delegacia = boletimOcorrencia.getDelegacia();
		this.delegado = boletimOcorrencia.getDelegado();
		this.dataHoraFato = boletimOcorrencia.getDataHoraDoFato();
		this.dataHoraBoletim = boletimOcorrencia.getDataHoraBoletim();
		this.dataHoraFimRegistro = boletimOcorrencia.getDataHoraFimRegistro();	
		
	}

	public int getIdBoletim() {
		return idBoletim;
	}

	public Delegado getDelegado() {
		return delegado;
	}

	public Delegacia getDelegacia() {
		return delegacia;
	}

	public LocalDateTime getDataHoraFato() {
		return dataHoraFato;
	}

	public LocalDateTime getDataHoraBoletim() {
		return dataHoraBoletim;
	}

	public LocalDateTime getDataHoraFimRegistro() {
		return dataHoraFimRegistro;
	}
	
}
