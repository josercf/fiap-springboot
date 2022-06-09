package br.com.fiap.appprodutoteste.produto.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.fiap.appprodutoteste.produto.model.Status;

public class ProdutoDto {
	private long id;
	
	@NotNull
	@NotBlank(message = "O campo nome deve ser informado")
	private String nome;
	private String descricao;
	
	@NotNull
	@DecimalMin(value = "0.0")
	private double valor;  
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}