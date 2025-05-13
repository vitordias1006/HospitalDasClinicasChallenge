package br.com.fiap.challenge.bean;


import java.time.LocalTime;

public class HorarioDisponivel {

    private Medico medico;

    private String data;

    private LocalTime horarioConsulta;

    private LocalTime inicioExpediente = LocalTime.of(10, 0);

    private LocalTime fimExpediente = LocalTime.of(18, 0);

    private boolean disponivel = true;

    public HorarioDisponivel() {

    }

    public HorarioDisponivel(Medico medico, String data, LocalTime horarioConsulta, LocalTime inicioExpediente, LocalTime fimExpediente, boolean disponivel) {

        super();
        this.medico = medico;
        this.data = data;
        this.horarioConsulta = horarioConsulta;
        this.inicioExpediente = inicioExpediente;
        this.fimExpediente = fimExpediente;
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

    public LocalTime getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(LocalTime horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    public LocalTime getInicioExpediente() {
        return inicioExpediente;
    }

    public void setHoraInicio(LocalTime inicioExpediente) {
        this.inicioExpediente = inicioExpediente;
    }

    public LocalTime getFimExpediente() {
        return fimExpediente;
    }

    public void setHoraFim(LocalTime fimExpediente) {
        this.fimExpediente = fimExpediente;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean marcarConsula(Especialidade especialidade, String data, LocalTime horarioConsulta) {

        if (horarioConsulta.isBefore(inicioExpediente) || horarioConsulta.isAfter(fimExpediente)) {
            System.out.println("Horario inválido, certifique-se de escolher um horário entre 10:00 e 18:00");
            return false;

        } else {
            return disponivel;

        }

    }

}
