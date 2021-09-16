package br.com.Drugstore.drugstore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Drugstore.drugstore.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Optional<Usuario> findByUsuario(String usuario);

}
