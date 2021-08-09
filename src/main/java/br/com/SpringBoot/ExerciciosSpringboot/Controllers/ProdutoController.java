package br.com.SpringBoot.ExerciciosSpringboot.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.SpringBoot.ExerciciosSpringboot.Model.Entities.Produto;
import br.com.SpringBoot.ExerciciosSpringboot.Model.Repositories.ProdutoRepository;


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtorepository;
	
	//salvando no banco com menos códigos
	@PostMapping("/novo")
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {		
		produtorepository.save(produto);
		return produto;
	}
	
	//Lista todos os produtos
	@GetMapping("/listar")
	public Iterable<Produto> ListarProduto() {
		return produtorepository.findAll();
	}
		
	/*
	@PostMapping("/novo")
	public Produto novoProduto(@RequestParam String nome, RequestParam Double preco, 
								@RequestParam Double desconto,@RequestParam int quantidade) {		
		Produto produto = new Produto(nome,preco,desconto,quantidade);
		produtorepository.save(produto);
		return produto;
	}*/
	
}
