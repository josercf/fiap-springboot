package br.com.fiap.appprodutoteste.produto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.appprodutoteste.produto.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	
}

