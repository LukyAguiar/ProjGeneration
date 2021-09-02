package br.com.Drugstore.drugstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.Drugstore.drugstore.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);

}
