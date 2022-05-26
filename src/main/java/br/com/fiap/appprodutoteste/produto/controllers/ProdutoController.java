package br.com.fiap.appprodutoteste.produto.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.appprodutoteste.produto.dto.ProdutoDto;
import br.com.fiap.appprodutoteste.produto.model.Categoria;
import br.com.fiap.appprodutoteste.produto.model.Produto;
import br.com.fiap.appprodutoteste.produto.repositories.CategoriaRepository;
import br.com.fiap.appprodutoteste.produto.repositories.ProdutoRepository;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ModelMapper modelMapper;

	@GetMapping("/produtos")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("produtos/index");
		List<Produto> produtoDaRepository = produtoRepository.findAll();
		modelView.addObject("listarProdutos", produtoDaRepository);
		return modelView;
	}

	@GetMapping("/produtos/criar")
	public ModelAndView criar(ProdutoDto produto) {
		ModelAndView modelView = new ModelAndView("produtos/criar");
		return modelView;
	}

	@PostMapping("produtos")
	public ModelAndView salvar( ProdutoDto produto) {
		Produto produtoEntity = modelMapper.map(produto, Produto.class);
		
		produtoRepository.save(produtoEntity);
		
		return new ModelAndView("redirect:/produtos");
	}

	
}
