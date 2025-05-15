package br.com.fiap.challenge.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Consulta{
	
	private long idConsulta;
	
	private Paciente paciente;

	private Especialidade especialidade;
	
	private Medico medico;

	private LocalDate dataConsulta;

	private LocalTime horaConsulta;

	private String comentario;

	private int nota;


	public Consulta() {
		
	}

	public Consulta(long idConsulta, Especialidade especialidade, Paciente paciente, Medico medico,LocalDate dataConsulta, LocalTime horaConsulta, String comentario, int nota) {
		this.idConsulta = idConsulta;
		this.paciente = paciente;
		this.medico = medico;
		this.dataConsulta = dataConsulta;
		this.horaConsulta = horaConsulta;
		this.comentario = comentario;
		this.nota = nota;
	}

	public long getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(long idConsulta) {
		this.idConsulta = idConsulta;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
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

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String marcarConsulta(String nomePaciente, LocalDate dataConsulta, LocalTime horaConsulta){
		return "Consulta marcada para o dia " + dataConsulta + " as " + horaConsulta + " para o paciente: " + nomePaciente;
	}

	public void avaliar(int nota, String comentario){
		this.nota = nota;
		this.comentario = comentario;

	}







}
