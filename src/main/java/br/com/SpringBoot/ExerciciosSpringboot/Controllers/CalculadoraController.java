package br.com.SpringBoot.ExerciciosSpringboot.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calcular")
public class CalculadoraController {

	//Modo 1 de requisição GET ( Pra min melhor)
	@GetMapping
	public int Somar(@RequestParam(name = "a")int a , @RequestParam(name = "b") int b) {
		Integer somar = a + b;
		return somar;
	}
	
	//Modo 2 de requisição GET 
	@GetMapping("/subtrair/{a}/{b}")
	public int Subtrair(@PathVariable(name = "a")int a , @PathVariable(name = "b")int b) {
		return a - b;
	}
	
	/*
	public double Multiplicar(@RequestParam(name = "a")Double a , @RequestParam(name = "b")Double b) {
		return a * b;
	}
	
	public double Dividir(@RequestParam(name = "a") Double a , @RequestParam(name = "a") Double b) {
		return a / b;
	}*/
}
