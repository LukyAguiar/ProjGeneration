package org.generation.blogPessoal.repository;

import org.generation.blogPessoal.model.Usuario;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	//Vai executar uma vez só e depois todos os teste serão executados 
	
	@BeforeAll
	void start() {
		
		Usuario usuario = new Usuario(0,"Lucas Aguiar", "Lucas.Nunes2500@hotmail.com", "159753");
	}
	
}

