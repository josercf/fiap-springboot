package br.com.fiap.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.dto.Produto;

@Controller()
public class ProdutoController {
	
	@GetMapping("/produto/criar")
	public ModelAndView criar() {
		ModelAndView model = new ModelAndView("produto/criar");
		
		Produto produto = new Produto();
		
		model.addObject("produto", produto);		
		
		return model;
	}
	
	@PostMapping("/produto/criar")
	public ModelAndView criar(@ModelAttribute("produto") Produto produto) {
		ModelAndView model = new ModelAndView("produto/index");
		
		ArrayList<Produto> estoque = new ArrayList<Produto>();		
		
		Produto produto1 = new Produto();
		produto1.setId(1);
		produto1.setNome("Notebook");
		produto1.setDescricao("Avel core I7");
		produto1.setValor(7000);
		
		Produto produto2 = new Produto();
		produto2.setId(2);
		produto2.setNome("Mouse");
		produto2.setDescricao("Logitech");
		produto2.setValor(54);
		
		Produto produto3 = new Produto();
		produto3.setId(3);
		produto3.setNome("Capa protetora");
		produto3.setDescricao("XPTO");
		produto3.setValor(100);
		
		
		estoque.add(produto1);
		estoque.add(produto2);
		estoque.add(produto3);
		
		produto.setId(estoque.size() + 1 );
		estoque.add(produto);
		
		model.addObject("estoque", estoque);
		
		return model;
	}
	
	
	@GetMapping("/produto")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("produto/index");
		
		ArrayList<Produto> estoque = new ArrayList<Produto>();
		
		
		Produto produto1 = new Produto();
		produto1.setId(1);
		produto1.setNome("Notebook");
		produto1.setDescricao("Avel core I7");
		produto1.setValor(7000);
		
		Produto produto2 = new Produto();
		produto2.setId(2);
		produto2.setNome("Mouse");
		produto2.setDescricao("Logitech");
		produto2.setValor(54);
		
		Produto produto3 = new Produto();
		produto3.setId(3);
		produto3.setNome("Capa protetora");
		produto3.setDescricao("XPTO");
		produto3.setValor(100);
		
		
		estoque.add(produto1);
		estoque.add(produto2);
		estoque.add(produto3);
		
		model.addObject("estoque", estoque);
		
		
		model.addObject("meunome", "Meu nome é José Romualdo");
		
		
		return model;
	}

}
