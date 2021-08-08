package br.com.SpringBoot.ExerciciosSpringboot.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.SpringBoot.ExerciciosSpringboot.Model.Entities.Cliente;

@RestController//informo que a classe vai ser a controladora onde manipula as requisicoes
@RequestMapping("/clientes") // a requisicao é acessada por essa URL
public class ClienteController {

	/*@GetMapping("/qualquer")// a sub-requisição de obterCliente vem por esse link 
	public Cliente obterCliente(){
		return new Cliente(2,"Joao","392.113.588-50");
	}*/
	
	
	@GetMapping("/{id}")//anotação diz que na URL o valor get vai ser o Id
	public Cliente obterClientePorId1(@PathVariable int id) {//anotação o Id digitado na URL, é mesmo passado no parâmetro
		return new Cliente(id,"Maria","987.444.555-98");
	}
	
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name ="id") int id) {
		return new Cliente(id,"Maria","987.444.555-98");
	}
}
