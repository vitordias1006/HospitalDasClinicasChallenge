package br.com.fiap.challenge.bean;

public class Paciente extends Pessoa {

    private String nomePaciente;

    private String dataNascimento;

    private String cpf;

    private Endereco endereco;

    public Paciente() {

    }

    public Paciente(String dataNascimento, String cpf, Endereco endereco, String nomePaciente) {
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.nomePaciente = nomePaciente;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String cadastro(String cpf, String dataNascimento, Endereco endereco, String nomePaciente) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.nomePaciente = nomePaciente;

        return "O paciente " + this.nomePaciente + "foi cadastrado com sucesso e está apto para marcar uma consulta.";

    }


}
