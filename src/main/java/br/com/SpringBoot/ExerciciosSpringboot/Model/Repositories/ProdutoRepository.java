package br.com.SpringBoot.ExerciciosSpringboot.Model.Repositories;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import br.com.SpringBoot.ExerciciosSpringboot.Model.Entities.Produto;

	//interface que traz os comandos CRUDs básicos para o Controller
	/*public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	}
	*/
	//interface que traz os comandos CRUDs básicos e consultas paginadas(além de outras) para o Controller
	public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{

		
	}