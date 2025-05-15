package br.com.fiap.challenge.bean;


import java.time.LocalDate;
import java.time.LocalTime;

public class HorarioDisponivel {

    private Especialidade especialidade;

    private LocalDate data;

    private LocalTime horarioConsulta;

    private LocalTime inicioExpediente = LocalTime.of(10, 0);

    private LocalTime fimExpediente = LocalTime.of(18, 0);

    private boolean disponivel = true;


    public HorarioDisponivel() {

    }

    public HorarioDisponivel(Especialidade especialidade, LocalDate data, LocalTime horarioConsulta, LocalTime inicioExpediente, LocalTime fimExpediente, boolean disponivel) {

        this.especialidade = especialidade;
        this.data = data;
        this.horarioConsulta = horarioConsulta;
        this.inicioExpediente = inicioExpediente;
        this.fimExpediente = fimExpediente;
        this.disponivel = disponivel;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
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

    public void setInicioExpediente(LocalTime inicioExpediente) {
        this.inicioExpediente = inicioExpediente;
    }

    public LocalTime getFimExpediente() {
        return fimExpediente;
    }

    public void setFimExpediente(LocalTime fimExpediente) {
        this.fimExpediente = fimExpediente;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String marcarConsulta(String especialidade, LocalDate data, LocalTime horarioConsulta) {
        if (horarioConsulta.isBefore(inicioExpediente) || horarioConsulta.isAfter(fimExpediente)) {
            return "Horário inválido, certifique-se de escolher um horário entre 10:00 e 18:00";


        } else if (!disponivel){
            return "Horário já reservado.";


        }else {
            return "Horário disponível, vá até a aba de consultas e marque a consulta desejada.";
        }

    }

}
