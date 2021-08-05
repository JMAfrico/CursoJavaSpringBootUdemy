package br.com.SpringBoot.ExerciciosSpringboot.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.SpringBoot.ExerciciosSpringboot.Models.Cliente;

@RestController//informo que a classe vai ser a controladora onde manipula as requisicoes
@RequestMapping("/clientes") // a requisicao é acessada por essa URL
public class ClienteController {

	@GetMapping("/qualquer")// a sub-requisição de obterCliente vem por esse link 
	public Cliente obterCliente(){
		return new Cliente(2,"Joao","392.113.588-50");
	}
}
