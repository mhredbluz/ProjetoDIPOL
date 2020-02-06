package br.com.magnasistemas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.magnasistemas.Dto.BoletimDto;
import br.com.magnasistemas.model.BoletimOcorrencia;
import br.com.magnasistemas.repository.BoletimRepository;

@RestController
@RequestMapping("/BO")
public class BoletimController {

	@Autowired
	private BoletimRepository boletimRepository;
	@GetMapping
	public List<BoletimDto>lista(){
		
		return null;
	}
}
