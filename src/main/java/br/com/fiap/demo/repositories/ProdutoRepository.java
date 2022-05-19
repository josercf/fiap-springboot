package br.com.fiap.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.demo.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	
}