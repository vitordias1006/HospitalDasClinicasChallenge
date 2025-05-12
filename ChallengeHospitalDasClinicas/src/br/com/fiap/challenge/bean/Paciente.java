package br.com.fiap.challenge.bean;

public class Paciente extends Pessoa {
	
	private String dataNascimento;
	
	private String cpf;
	
	private Endereco endereco;
	
	public Paciente() {
		
	}


	public Paciente(String dataNascimento, String cpf, Endereco endereco) {
		super();
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.endereco = endereco;
	}



	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}
