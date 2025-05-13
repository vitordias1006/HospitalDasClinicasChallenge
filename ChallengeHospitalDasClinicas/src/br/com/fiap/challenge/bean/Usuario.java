package br.com.fiap.challenge.bean;

public class Usuario extends Pessoa{

	private String cpf;
	
	private String telefone;
	
	public Usuario() {
		
	}

	public Usuario(String nome, String cpf, String telefone) {
		super.setNome(nome);
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

	public String cadastro(String cpf, String telefone){
		this.cpf = cpf;
		this.telefone = telefone;
		return "Cadastro realizado com sucesso " + super.getNome();
	}

	
}
