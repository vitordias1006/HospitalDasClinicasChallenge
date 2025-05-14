package br.com.fiap.challenge.main;

import br.com.fiap.challenge.bean.Endereco;
import br.com.fiap.challenge.bean.HorarioDisponivel;
import br.com.fiap.challenge.bean.Paciente;
import br.com.fiap.challenge.bean.Usuario;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    String aux, nome, nomePaciente, telefone, cpf, crm, especialidade, rua, bairro, estado, cidade, cep, responsavel, consulta, escolha = "sim", mensagem;

    int opcao, numero;

    LocalTime horarioConsulta, inicioExpediente, fimExpediente, horaConsulta;

    LocalDate dataConsulta, dataNascimento, data;

    LocalDate dataAtual = LocalDate.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    while (escolha.equalsIgnoreCase("sim")){
        try{
            aux = JOptionPane.showInputDialog("O que deseja fazer em nosso site?\n 1.Cadastro de usuario\n 2. Horarios disponíveis para Consulta\n 3. Marcar Consulta\n 4. Ver Consulta\n 5. Ver Agenda de Consultas");
            opcao = Integer.parseInt(aux);

            switch (opcao) {
                case 1:
                    Usuario usuario = new Usuario();
                    nome = JOptionPane.showInputDialog("Digite o seu nome: ");
                    cpf = JOptionPane.showInputDialog("Digite o seu cpf: ");
                    telefone = JOptionPane.showInputDialog("Digite o seu telefone: ");

                    usuario.setNome(nome);
                    mensagem = usuario.cadastro(cpf, telefone);

                    JOptionPane.showMessageDialog(null, mensagem);
                    break;

                case 2:
                    HorarioDisponivel horarioDisponivel = new HorarioDisponivel();
                    especialidade = JOptionPane.showInputDialog("Em qual especialidade quer ser atendido? ");
                    aux = JOptionPane.showInputDialog("Insira o dia que deseja marcar consulta: (dd/MM/yyyy)");
                    data = LocalDate.parse(aux, dtf);
                    aux = JOptionPane.showInputDialog("Insira o horário que deseja realizar a consulta: (HH:MM)");
                    horaConsulta = LocalTime.parse(aux);

                    mensagem = horarioDisponivel.marcarConsulta(especialidade, data, horaConsulta);

                    JOptionPane.showMessageDialog(null, mensagem);

                    break;

                case 3:
                    Paciente paciente = new Paciente();
                    nomePaciente = JOptionPane.showInputDialog("Digite o nome do paciente: ");
                    aux = JOptionPane.showInputDialog("Digite a data de nascimento do paciente: (dd/MM/yyyy)");
                    dataNascimento = LocalDate.parse(aux, dtf);
                    cpf = JOptionPane.showInputDialog("Digite o CPF do paciente: ");
                    rua = JOptionPane.showInputDialog("Digite a rua de residência do paciente: ");
                    aux = JOptionPane.showInputDialog("Digite o número da casa: ");
                    numero = Integer.parseInt(aux);
                    cep = JOptionPane.showInputDialog("Digite o cep da residência: ");
                    bairro = JOptionPane.showInputDialog("Digite o bairro de residência: ");
                    cidade = JOptionPane.showInputDialog("Digite a cidade onde vive: ");


                break;


            }

        } catch(Exception e) {


        }

    }


    }


}
