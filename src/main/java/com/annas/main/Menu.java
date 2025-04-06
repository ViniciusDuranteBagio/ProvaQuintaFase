package com.annas.main;

import javax.swing.*;

public class Menu {

    public int inicio(){
        return Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "Escolha um número \n" +
                        "1 - Criar colaborador ativo \n" +
                                "2 - Fechar \n"
                )
        );
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
                        "O " + motivo + " não pode ser negativo. \nTente novamente.");
            }
        } while (!valorValido);

        return valor;
    }



}
