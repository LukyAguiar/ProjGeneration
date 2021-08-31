package com.storegames.minhaLojaDeGames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.storegames.minhaLojaDeGames.model.Produto;
import com.storegames.minhaLojaDeGames.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")

@CrossOrigin("*")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repository; 
	
	@GetMapping 
	public ResponseEntity<List<Produto>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
}
