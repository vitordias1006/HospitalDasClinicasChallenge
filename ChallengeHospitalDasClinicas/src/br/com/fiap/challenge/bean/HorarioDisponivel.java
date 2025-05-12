package br.com.fiap.challenge.bean;

public class HorarioDisponivel {
	
	private Medico medico;
	
	private String data;
	
	private String horaInicio;
	
	private String horaFim;
	
	private boolean disponivel;
	
	public HorarioDisponivel() {
		
	}

	public HorarioDisponivel(Medico medico, String data, String horaInicio, String horaFim, boolean disponivel) {
		super();
		this.medico = medico;
		this.data = data;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.disponivel = disponivel;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	
}
