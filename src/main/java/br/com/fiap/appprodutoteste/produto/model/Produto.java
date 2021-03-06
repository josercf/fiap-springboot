package br.com.fiap.appprodutoteste.produto.model;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;



//ctrl + shift + o = atalho para fazer os imports 
@Entity
public class Produto {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="produtoSequence")
	@SequenceGenerator(name="produtoSequence", sequenceName="produtoSequence")
	@Id
	private Long id; 
	
	@Column(nullable = false)
	private String nome; 
	private Integer quantidade; 
	private BigDecimal valor;

	public Produto() {
	}
	
	public Produto(Long id, String nome, Integer quantidade, BigDecimal valor) {
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}

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
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	} 
}
