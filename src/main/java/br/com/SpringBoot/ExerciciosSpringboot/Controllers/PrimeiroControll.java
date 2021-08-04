package br.com.SpringBoot.ExerciciosSpringboot.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroControll {

	//anotação que mapeia e retorna(GET) o método no navegador, na porta 8080. 
		//path = é o que vem depois da porta para identificar URL que ira chamar o método se for do tipo GET
	//@RequestMapping(method = RequestMethod.GET, path = "/ola") = (http://localhost:8080/ola)
	//@RequestMapping(method = RequestMethod.GET) = (http://localhost:8080)
	//@GetMapping - faz a mesma coisa sem precisar chamar o parâmetro
	
	@GetMapping(path = {"/saudacao"})
	public String ola() {
		return "Ola Spring boot!";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/ola")
	public String saudacao() {
		return "Ola Spring boot!!!!!";
	}
}
