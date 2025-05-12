package br.com.fiap.challenge.bean;

public class Usuario {

	private String cpf;
	
	private String telefone;
	
	public Usuario() {
		
	}

	public Usuario(String cpf, String telefone) {
		super();
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
