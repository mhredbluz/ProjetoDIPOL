package br.com.magnasistemas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.magnasistemas.model.BoletimOcorrencia;

public interface BoletimRepository extends JpaRepository<BoletimOcorrencia, Integer>{

}
