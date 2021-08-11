package br.com.SpringBoot.ExerciciosSpringboot.Model.Repositories;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.SpringBoot.ExerciciosSpringboot.Model.Entities.Produto;

	//interface que traz os comandos CRUDs básicos para o Controller
	/*public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	}
	*/
	//interface que traz os comandos CRUDs básicos e consultas paginadas(além de outras) para o Controller
	public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{
		
		//Método que faz a consulta pelo nome, sem necessitar de implementação
		//Basta seguir a convenção findBy_Containing que o Springboot implementa
		//uma Query Select por tras, e busca a caracteristica que esta passado como parâmetro
		public Iterable<Produto> findByNomeContainingIgnoreCase(String nome);
		
		//EXEMPLO DE CONSULTA POR NOME USANDO JPQL
		@Query("SELECT p from Produto p Where p.nome Like %:nome%")
		public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
		
		
		
	}
	
	