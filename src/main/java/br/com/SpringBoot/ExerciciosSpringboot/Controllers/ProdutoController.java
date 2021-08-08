package br.com.SpringBoot.ExerciciosSpringboot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.SpringBoot.ExerciciosSpringboot.Model.Entities.Produto;
import br.com.SpringBoot.ExerciciosSpringboot.Model.Repositories.ProdutoRepository;


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtorepository;
	
	@PostMapping("/novo")
	public Produto novoProduto(@RequestParam String nome, 
								@RequestParam Double preco, 
								@RequestParam Double desconto) {
		Produto produto = new Produto(nome,preco,desconto);
		produtorepository.save(produto);
		return produto;
	}
	
	/*@GetMapping("/todos")
	public ResponseEntity<List<Produto>> ListaProduto() {
		List<Produto> produtosList = produtorepository.findAll();
		return ResponseEntity.ok().body(produtosList);
		
		//return ListaProduto();
	}*/
	
	
}
