package com.annas.main;

import com.annas.service.colaborador.Pessoa;

import javax.swing.*;

public class Menu {

    public int inicio(){
        int valor;
        boolean valorValido = false;

        do {
            valor = Integer.parseInt(
                    JOptionPane.showInputDialog(null,
                            "Escolha um número \n" +
                                    "1 - Criar colaborador ativo \n" +
                                    "2 - Fechar \n"
                    ));

            if (valor == 1 || valor == 2) {
                valorValido = true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "ERRO: \n O valor selecionado não pode ser " + valor + "!\nPor favor, tente novamente com um valor permitido (1 ou 2).",
                        "Valor Inválido",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (!valorValido);

        return valor;

    }

    public String cargo(){
        String[] cargo = {"Caixa", "Faxineiro", "Repositor", "Segurança", "Vendedor"};

        return (String) JOptionPane.showInputDialog(
                null,
                "Escolha um cargo:",
                "Cargos",
                JOptionPane.QUESTION_MESSAGE,
                null,
                cargo,
                cargo[0]
        );
    }

    public String turno(){
        String[] turno = {"Comercial", "Noturno"};

        return (String) JOptionPane.showInputDialog(
                null,
                "Escolha um turno:",
                "Turnos",
                JOptionPane.QUESTION_MESSAGE,
                null,
                turno,
                turno[0]
        );
    }

    public double valorDouble(String motivo){
        double valor;
        boolean valorValido = false;

        do {
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o " + motivo));

            if (valor >= 0) {
                valorValido = true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "ERRO: O " + motivo + " não pode ser negativo!\nPor favor, tente novamente com um valor positivo.",
                        "Valor Inválido",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (!valorValido);

        return valor;
    }

    public void visualizar(Pessoa pessoa){
        JOptionPane.showMessageDialog(null,
                "Nome: " + pessoa.getNome() + "\n" +
                        "Cargo: " + pessoa.getCargo().getDescricao() + "\n" +
                        "Turno: " + pessoa.getCargo().getTurno() + "\n" +
                        "Sálario: " + pessoa.getCargo().getSalarioBase() + "\n"
        );
    }



}
