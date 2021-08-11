package br.com.SpringBoot.ExerciciosSpringboot.Controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	//---------SALVANDO NO BANCO--------------//
	
	//TIPO 1//
//	@PostMapping("/novo")
//	public @ResponseBody Produto novoProduto(@Valid Produto produto) {		
//		produtorepository.save(produto);
//		return produto;
//	}
	
	/*//TIPO 2//
	@PostMapping("/novo")
	public Produto novoProduto(@RequestParam String nome, RequestParam Double preco, 
								@RequestParam Double desconto,@RequestParam int quantidade) {		
		Produto produto = new Produto(nome,preco,desconto,quantidade);
		produtorepository.save(produto);
		return produto;
	}*/
	
	
	//---------LISTANDO TODOS OS PRODUTOS--------------//
	
	//Todos os produtos
	@GetMapping("/listar")
	public Iterable<Produto> ListarProduto() {
		return produtorepository.findAll();
	}
	
	//Todos os produtos limitados por quantidade e páginas
	@GetMapping(path = "/listar/{numPagina}")
	public Iterable<Produto> ListarProdutoPorPagina(@PathVariable int numPagina) {
		Pageable page = PageRequest.of(numPagina, 5);
		return produtorepository.findAll(page);
	}
	
	//---------LISTANDO PRODUTOS POR ID--------------//
	
	
	//TIPO 1//
	//http://localhost:8080/api/produtos/5
	@GetMapping(path="/{id}")
	public Optional<Produto> ListarPorId(@PathVariable int id){
		return produtorepository.findById(id);
	}
	
	//TIPO 2//
	//http://localhost:8080/api/produtos?id=3
	@GetMapping()
	public Optional<Produto> ListarId(@RequestParam(name = "id") int id){
		return produtorepository.findById(id);
	}

	
	//---------ALTERANDO PRODUTOS--------------//
	
	//TIPO 1//
	//http://localhost:8080/api/produtos
//	@PutMapping()
//	public @ResponseBody Produto alterarProduto(@Valid Produto produto) {		
//		produtorepository.save(produto);
//		return produto;
//	}
	
	//TIPO 2// - JUNTAR O MÉTODO POST + PUT EM UM MÉTODO
	//QUANDO A REQUISIÇÃO FOR SEM ID,SALVA NOVO ,TANTO USANDO POST QUANTO PUT
	//QUANDO A REQUISIÇÃO FOR COM ID,ALTERA POR ID,TANTO USANDO POST QUANTO PUT
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto salvarProduto(@Valid Produto produto) {		
		produtorepository.save(produto);
		return produto;
	}
	
	//---------DELETANDO PRODUTOS--------------//
	
	//TIPO 1- DELETANDO POR ID//
	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtorepository.deleteById(id);
		
	}
}
