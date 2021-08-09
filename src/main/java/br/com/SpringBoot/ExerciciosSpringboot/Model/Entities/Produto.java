package br.com.SpringBoot.ExerciciosSpringboot.Model.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Max;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name = "nome_produto")
	@NotBlank
	private String nome;
	
	
	@Column(name = "preco_produto")
	@Min(0)
	private Double preco;
	

	@Column(name = "desconto_produto")
	@Min(0)
	@Max(1)
	private Double desconto;
	
	
	@Column(name = "quantidade")
	@Min(1)
	private Integer quantidade;
	
	/*@Column(name = "valor_total")
	private Double total;*/
	
	public Produto() {
		
	}
	
	public Produto(String nome, Double preco, Double desconto, Integer quantidade) {
		super();		
		setNome(nome);
		setPreco(preco);
		setDesconto(desconto);
		setQuantidade(quantidade);
		//setTotal(getTotal());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
		
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;		
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	/*public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		//PREÇO COMUM = this.total = total ;
		//PREÇO COM DESCONTO = total = preco - (preco * desconto);
		double q = (double) quantidade; // Cast na quantidade para poder multiplicar pelo preco(double x double)
		total = (preco - (preco * desconto))*q;
		this.total = total ;
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
