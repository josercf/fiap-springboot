package br.com.fiap.appprodutoteste.produto.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Fabricante {
	
	public Fabricante() {
		
	}
	
	public Fabricante(Long id, String nome)
	{
	  this.setId(id);
	  this.setNome(nome);
	}

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="fabricanteSequence")
	@SequenceGenerator(name="fabricanteSequence", sequenceName="fabricanteSequence")
	@Id
	@Column(name = "id_fabricante")
	private Long id;
	
	private String nome;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn
	private Produto produto;
	
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
