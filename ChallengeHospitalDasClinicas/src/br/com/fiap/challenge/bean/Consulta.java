package br.com.fiap.challenge.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
	
	private long idConsulta;
	
	private Paciente paciente;
	
	private Medico medico;

	private LocalDate dataConsulta;

	private LocalTime horaConsulta;
	
	private String status;


	public Consulta() {
		
	}

	public Consulta(long idConsulta, Paciente paciente, Medico medico,LocalDate dataConsulta, LocalTime horaConsulta, String status) {
		this.idConsulta = idConsulta;
		this.paciente = paciente;
		this.medico = medico;
		this.dataConsulta = dataConsulta;
		this.horaConsulta = horaConsulta;
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

	public LocalDate getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(LocalDate dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public LocalTime getHoraConsulta() {
		return horaConsulta;
	}

	public void setHoraConsulta(LocalTime horaConsulta) {
		this.horaConsulta = horaConsulta;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String marcarConsulta(Paciente paciente, LocalTime dataConsulta, LocalTime horaConsulta){
		return "Consulta marcada para o dia " + dataConsulta + "as " + horaConsulta + "para o paciente: " + paciente;
	}

}
