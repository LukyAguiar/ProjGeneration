package com.atividades.atividadeTeleAulas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/atividade2")

public class AtividadesC2 {

	@GetMapping
	public String atividade2(String objetivos, String semana) {
		semana = "Semana 06 | AGOSTO";
		objetivos = "Melhorar minha Lógica | Melhorar minha comunicação | Terminar 5 cursos";
		
		return semana + "-" + objetivos;
		
		
	}
	
}
