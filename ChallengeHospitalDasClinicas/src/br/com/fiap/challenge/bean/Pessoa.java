package br.com.fiap.challenge.bean;

public class Pessoa  {
	
	private String nome;
	
	private String telefone;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String cadastro(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
		return "Cadastro realizado com sucesso: " + this.nome;
	}

	
}
