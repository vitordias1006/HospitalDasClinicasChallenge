package br.com.fiap.challenge.bean;

public class Medico extends Pessoa {
	
	private String crm;
	
	private Especialidade especialidade;
	
	public Medico() {
		
	}

	public Medico(String nome, String crm, Especialidade especialidade) {
		super.setNome(nome);
		this.crm = crm;
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public String cadastro(String nome, String crm, Especialidade especialidade){
		super.setNome(nome);
		this.crm = crm;
		this.especialidade = especialidade;
		return "O médico " + super.getNome() + "está registrado no site Conselho Federal de Medicina";


	}

}
