package br.com.SpringBoot.ExerciciosSpringboot.Model.Repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.SpringBoot.ExerciciosSpringboot.Model.Entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

	
}
