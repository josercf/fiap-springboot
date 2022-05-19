package br.com.fiap.demo.controllers;

import java.util.ArrayList;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.demo.dto.ProdutoDto;
import br.com.fiap.demo.model.Produto;
import br.com.fiap.demo.repositories.ProdutoRepository;


@Controller()
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/produto/criar")
	public ModelAndView criar() {
		ModelAndView model = new ModelAndView("produto/criar");
		
		ProdutoDto produto = new ProdutoDto();
		
		Produto produtoModel = modelMapper.map(produto, Produto.class);
		
		
		//produtoRepository.save(produtoModel);
		
		model.addObject("produto", produto);		
		
		return model;
	}
	
	@PostMapping("/produto/criar")
	public ModelAndView criar(@ModelAttribute("produto") ProdutoDto produto) {
		ModelAndView model = new ModelAndView("produto/index");
		
		ArrayList<ProdutoDto> estoque = new ArrayList<ProdutoDto>();		
		
		ProdutoDto produto1 = new ProdutoDto();
		produto1.setId(1);
		produto1.setNome("Notebook");
		produto1.setDescricao("Avel core I7");
		produto1.setValor(7000);
		
		ProdutoDto produto2 = new ProdutoDto();
		produto2.setId(2);
		produto2.setNome("Mouse");
		produto2.setDescricao("Logitech");
		produto2.setValor(54);
		
		ProdutoDto produto3 = new ProdutoDto();
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
		
		ArrayList<ProdutoDto> estoque = new ArrayList<ProdutoDto>();
		
		
		ProdutoDto produto1 = new ProdutoDto();
		produto1.setId(1);
		produto1.setNome("Notebook");
		produto1.setDescricao("Avel core I7");
		produto1.setValor(7000);
		
		ProdutoDto produto2 = new ProdutoDto();
		produto2.setId(2);
		produto2.setNome("Mouse");
		produto2.setDescricao("Logitech");
		produto2.setValor(54);
		
		ProdutoDto produto3 = new ProdutoDto();
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
