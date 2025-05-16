package br.com.fiap.challenge.bean;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Consulta> consultas;

    private Paciente paciente;

    public Agenda(){
        this.consultas  = new ArrayList<>();

    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public void adicionarConsulta(Consulta consulta){

        consultas.add(consulta);
    }

    public List<Consulta> listarConsultas(){
        return consultas;

    }

    public String avaliarConsulta(String nomePaciente, LocalDate data, LocalTime hora, int nota, String comentario){
        for (Consulta c : consultas) {
            if (c.getPaciente().getNome().equalsIgnoreCase(nomePaciente)
                    && c.getDataConsulta().equals(data)
                    && c.getHoraConsulta().equals(hora)) {

                c.avaliar(nota, comentario);
                return "Avaliação registrada com sucesso!";
            }
        }
        return "Consulta não encontrada.";

    }

}
