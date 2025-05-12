package br.com.fiap.challenge.bean;

public class Agendamento {
	
	private Consulta consulta;
	
	private String dataAgendamento;
	
	private String canalAgendamento;
	
	public Agendamento() {
		
	}

	public Agendamento(Consulta consulta, String dataAgendamento, String canalAgendamento) {
		super();
		this.consulta = consulta;
		this.dataAgendamento = dataAgendamento;
		this.canalAgendamento = canalAgendamento;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public String getDataAgendamento() {
		return dataAgendamento;
	}m

	public void setDataAgendamento(String dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public String getCanalAgendamento() {
		return canalAgendamento;
	}

	public void setCanalAgendamento(String canalAgendamento) {
		this.canalAgendamento = canalAgendamento;
	}
	
	

}
