package br.com.fiap.challenge.bean;

import java.util.ArrayList;
import java.util.List;

public class Agenda extends Consulta{

    private List<String> consultas;

    private String responsavel;

    public Agenda(){
        this.consultas = new ArrayList<>();
    }

    public List<String> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<String> consultas) {
        this.consultas = consultas;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public void adicionarConsulta(String consulta){
        consultas.add(consulta);

    }

    public void listarConsultas(){
        for (String str : consultas){
            System.out.println(str);
        }
    }

}
