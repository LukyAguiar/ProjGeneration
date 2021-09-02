package br.com.Drugstore.drugstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Drugstore.drugstore.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	
}
