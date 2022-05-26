package br.com.fiap.appprodutoteste.produto.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Categoria {
	
	public Categoria() {
		
	}
	
	public Categoria(Long id, String nome)
	{
	  this.setId(id);
	  this.setNome(nome);
	}

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="categoriaSequence")
	@SequenceGenerator(name="categoriaSequence", sequenceName="categoriaSequence")
	@Id
	private Long id;
	
	private String nome;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
