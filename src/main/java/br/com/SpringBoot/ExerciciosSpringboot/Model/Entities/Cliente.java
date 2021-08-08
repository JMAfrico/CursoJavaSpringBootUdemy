package br.com.SpringBoot.ExerciciosSpringboot.Model.Entities;

public class Cliente {

	private int id;
	private String nome;
	private String cpf;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(int id, String nome, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
