package com.storegames.minhaLojaDeGames.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.storegames.minhaLojaDeGames.model.UserLogin;
import com.storegames.minhaLojaDeGames.model.Usuario;
import com.storegames.minhaLojaDeGames.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping ("/login")
	public ResponseEntity <UserLogin> Authentication (@RequestBody Optional <UserLogin> usuario) {
		return usuarioService.login(usuario)
				.map(resp -> ResponseEntity.ok (resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping ("/cadastrar")
	public ResponseEntity <Usuario> post(@RequestBody Usuario usuario) {
		return usuarioService.cadastrar(usuario)
				.map (resp -> ResponseEntity.status (HttpStatus.CREATED).body(resp))
				.orElse (ResponseEntity.status(HttpStatus.CONFLICT).build());
	}
	
}
