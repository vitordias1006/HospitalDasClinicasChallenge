package br.com.fiap.challenge.main;

import br.com.fiap.challenge.bean.*;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String aux, nome, nomePaciente, telefone, cpf, crm, nomeEspecialidade, rua, bairro, estado, cidade, cep, responsavel, consulta, escolha = "sim", mensagem;

        Agenda agenda = new Agenda();

        Especialidade especialidade = new Especialidade();

        int opcao, numero;

        LocalTime horarioConsulta, inicioExpediente, fimExpediente, horaConsulta;

        LocalDate dataConsulta, dataNascimento, data;

        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (escolha.equalsIgnoreCase("sim")) {

            try {
                aux = JOptionPane.showInputDialog("O que deseja fazer em nosso site?\n 1.Cadastro de Usuário\n 2. Registrar Médico \n 3. Horarios disponíveis para Consulta \n 4. Marcar Consulta\n 5. Ver Agenda de Consultas\n 6.Avaliar Consulta Médica");
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
                        Medico medico = new Medico();

                        nome = JOptionPane.showInputDialog("Digite o nome do médico: ");
                        crm = JOptionPane.showInputDialog("Digite o CRM do médico: ");
                        telefone = JOptionPane.showInputDialog("Digite o telefone do médico: ");

                        aux = JOptionPane.showInputDialog("Digite a especialidade do médico: ");
                        Especialidade espMedico = new Especialidade();
                        espMedico.setNomeEspecialidade(aux);

                        medico.setNome(nome);
                        medico.setCrm(crm);
                        medico.setTelefone(telefone);
                        medico.setEspecialidade(espMedico);

                        JOptionPane.showMessageDialog(null, "Médico registrado com sucesso!");

                        break;


                    case 3:
                        HorarioDisponivel horarioDisponivel = new HorarioDisponivel();
                        nomeEspecialidade = JOptionPane.showInputDialog("Em qual especialidade quer ser atendido? ");
                        aux = JOptionPane.showInputDialog("Insira o dia que deseja marcar consulta: (dd/MM/yyyy)");
                        data = LocalDate.parse(aux, dtf);
                        aux = JOptionPane.showInputDialog("Insira o horário que deseja realizar a consulta: (HH:MM)");
                        horaConsulta = LocalTime.parse(aux);

                        mensagem = horarioDisponivel.marcarConsulta(nomeEspecialidade, data, horaConsulta);

                        JOptionPane.showMessageDialog(null, mensagem);

                        break;

                    case 4:
                        Paciente paciente = new Paciente();
                        Consulta consulta1 = new Consulta();

                        aux = JOptionPane.showInputDialog("Digite o nome do paciente: ");
                        nomePaciente = aux;
                        aux = JOptionPane.showInputDialog("Digite a data de nascimento do paciente: (dd/MM/yyyy)");
                        dataNascimento = LocalDate.parse(aux, dtf);
                        aux = JOptionPane.showInputDialog("Digite o CPF do paciente: ");
                        cpf = aux;
                        aux = JOptionPane.showInputDialog("Digite a rua de residência do paciente: ");
                        rua = aux;
                        aux = JOptionPane.showInputDialog("Digite o número da casa: ");
                        numero = Integer.parseInt(aux);
                        aux = JOptionPane.showInputDialog("Digite o cep da residência: ");
                        cep = aux;
                        aux = JOptionPane.showInputDialog("Digite o bairro de residência: ");
                        bairro = aux;
                        aux = JOptionPane.showInputDialog("Digite a cidade onde vive: ");
                        cidade = aux;

                        paciente.setNome(nomePaciente);

                        aux = JOptionPane.showInputDialog("Em qual especialidade deseja ser atendido?");
                        Especialidade especialidade1 = new Especialidade();
                        especialidade1.setNomeEspecialidade(aux);

                        aux = JOptionPane.showInputDialog("Para qual dia deseja marcar sua consulta?");
                        dataConsulta = LocalDate.parse(aux, dtf);
                        aux = JOptionPane.showInputDialog("Para que horas deseja marcar a sua consulta?");
                        horaConsulta = LocalTime.parse(aux);



                        mensagem = consulta1.marcarConsulta(nomePaciente, dataConsulta, horaConsulta);
                        JOptionPane.showMessageDialog(null, mensagem);
                        agenda.adicionarConsulta(consulta1);
                        consulta1.setPaciente(paciente);
                        consulta1.setDataConsulta(dataConsulta);
                        consulta1.setHoraConsulta(horaConsulta);
                        consulta1.setEspecialidade(especialidade1);

                        break;

                    case 5:
                        Agenda agenda1;
                        List<Consulta> consultas = agenda.listarConsultas();

                        if (consultas.isEmpty()){
                            JOptionPane.showMessageDialog(null, "Nenhuma consulta agendada.");
                        } else {
                            String agendaStr = "Consultas agendadas: \n";

                            for (Consulta c : consultas) {
                                agendaStr = agendaStr + "Paciente: " + c.getPaciente().getNome()+
                                                        " |Data: " + c.getDataConsulta() +
                                                        " |Hora: " + c.getHoraConsulta() +
                                                        " |Especialidade: " + c.getEspecialidade().getNomeEspecialidade() +
                                                        "\n";

                            }
                                JOptionPane.showMessageDialog(null, agendaStr);
                        }

                        break;


                    case 6:

                        aux = JOptionPane.showInputDialog("Digite o nome do paciente:");
                        nomePaciente = aux;

                        aux = JOptionPane.showInputDialog("Digite a data da consulta: (dd/MM/yyyy)");
                        dataConsulta = LocalDate.parse(aux, dtf);

                        aux = JOptionPane.showInputDialog("Digite a hora da consulta: (HH:MM)");
                        horaConsulta = LocalTime.parse(aux);

                        aux = JOptionPane.showInputDialog("Digite uma nota de 1 até 5 para a consulta feita:");
                        int nota = Integer.parseInt(aux);

                        String comentario = JOptionPane.showInputDialog("Se preferir também deixar um comentário deixe aqui:");

                        mensagem = agenda.avaliarConsulta(nomePaciente, dataConsulta, horaConsulta, nota, comentario);
                        JOptionPane.showMessageDialog(null, mensagem);
                        break;

                    default:

                        throw new Exception("Opção inválida, tente novamente usando outra opção.");

                }

                escolha = JOptionPane.showInputDialog("Deseja continuar?");

            } catch (Exception e) {
                System.out.println(e.getMessage());

            }

        }


    }


}
