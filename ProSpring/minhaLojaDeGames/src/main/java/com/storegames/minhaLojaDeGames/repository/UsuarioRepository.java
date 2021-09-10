package com.storegames.minhaLojaDeGames.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storegames.minhaLojaDeGames.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

							//nome reservado
	public Optional<Usuario> findByUsuario(String usuario);
}
