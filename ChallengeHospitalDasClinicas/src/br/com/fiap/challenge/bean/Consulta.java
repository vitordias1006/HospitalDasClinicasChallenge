package br.com.fiap.challenge.bean;

public class Consulta {
	
	private long idConsulta;
	
	private Paciente paciente;
	
	private Medico medico;

	private String dataHora;
	
	private String status;
	
	public Consulta() {
		
	}

	public Consulta(long idConsulta, Paciente paciente, Medico medico, String dataHora, String status) {
		super();
		this.idConsulta = idConsulta;
		this.paciente = paciente;
		this.medico = medico;
		this.dataHora = dataHora;
		this.status = status;
	}

	public long getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(long idConsulta) {
		this.idConsulta = idConsulta;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



	
	
}
