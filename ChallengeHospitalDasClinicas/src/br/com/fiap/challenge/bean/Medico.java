package br.com.fiap.challenge.bean;

public class Medico extends Pessoa {
	
	private String crm;
	
	private Especialidade especialidade;
	
	public Medico() {
		
	}

	public Medico(String crm, Especialidade especialidade) {
		super();
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
	
	
	
	

}
