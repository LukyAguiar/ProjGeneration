package com.atividades.atividadeTeleAulas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade")

public class AtividadesC1 {

	@GetMapping
	public String atividade(String habilidades, String mentalidades, String resultado) 
	{
		
		habilidades = "Habilidades: Atenção aos Detalhes " ;
		mentalidades = "Mentalidades: Persistência" ;
		resultado = mentalidades + " | " + habilidades ;
		return resultado ; 
	}
	
}
