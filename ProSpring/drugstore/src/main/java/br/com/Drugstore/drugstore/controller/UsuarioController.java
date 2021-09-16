package br.com.Drugstore.drugstore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.Drugstore.drugstore.model.UserLogin;
import br.com.Drugstore.drugstore.model.Usuario;
import br.com.Drugstore.drugstore.repository.UsuarioRepository;
import br.com.Drugstore.drugstore.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")

@CrossOrigin(origins =  "*", allowedHeaders = "*")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	//Método Get All, pega todos as informações do úsuario
	@GetMapping("/all")
	public ResponseEntity<List<Usuario>> GettAll(){
		return ResponseEntity.ok(usuarioRepository.findAll());
	}
	
	
	//Método POST para logar
	@PostMapping("/login")
	public ResponseEntity <UserLogin> Authentication (@RequestBody Optional <UserLogin> user){
		return  usuarioService.Login(user)
				.map(resp -> ResponseEntity.ok (resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	
	// Métodod POST para cadastrar o usuario
	@PostMapping("/cadastrar")
	public ResponseEntity <Usuario> post (@RequestBody Usuario usuario){
		return usuarioService.CadastrarUsuario(usuario)
				.map (resp -> ResponseEntity.status (HttpStatus.CREATED).body(resp))
				.orElse (ResponseEntity.status(HttpStatus.CONFLICT).build());
		
	}
}
