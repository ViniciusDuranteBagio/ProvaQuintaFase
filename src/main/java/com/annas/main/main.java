package com.annas.main;

import com.annas.service.cargos.*;
import com.annas.service.colaborador.Pessoa;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        boolean ativo = true;
        int op;

        do {
            op = menu.inicio();

            if (op == 1) {
                double salarioBase = 0;
                String nome = JOptionPane.showInputDialog("Digite o nome colaborador: ");
                String turno = menu.turno();
                String cargo = menu.cargo();

                if (!cargo.equalsIgnoreCase("Repositor")){
                    salarioBase = menu.valorDouble("Salário");
                }

                switch (cargo) {
                        case "Caixa":
                                Caixa cx = new Caixa(cargo, turno, salarioBase);
                                Pessoa pessoaCaixa = new Pessoa(nome, cx);
                                pessoaCaixa.visualizar(pessoaCaixa);
                            break;

                        case "Faxineiro":
                                double turnosExtras = menu.valorDouble("quantidade de turnos extras");
                                double bonus = menu.valorDouble(" valor do bonus");

                                Faxineiro fx = new Faxineiro(cargo, turno, turnosExtras, salarioBase, bonus);
                                Pessoa pessoafx = new Pessoa(nome, fx);
                                pessoafx.visualizar(pessoafx);

                            break;

                        case "Repositor":

                                double qtdHorasTrabalhadas = menu.valorDouble("quantidade de horas trabalhadas: ");
                                double valorHora = menu.valorDouble("valor da hora");

                                Repositor rp = new Repositor(cargo, turno, qtdHorasTrabalhadas, valorHora);
                                Pessoa pessoaRp = new Pessoa(nome, rp);
                                pessoaRp.visualizar(pessoaRp);

                            break;

                        case "Seguranca":
                            Seguranca sg = new Seguranca(cargo, turno, salarioBase);

                            Pessoa pessoaSg = new Pessoa(nome, sg);
                            pessoaSg.visualizar(pessoaSg);

                            break;

                        case "Vendedor":

                            double qtdVendas = menu.valorDouble("quantidade de vendas");
                            double comissao = menu.valorDouble("valor da comissão");

                            Vendedor vd = new Vendedor(cargo, turno, salarioBase, qtdVendas, comissao);
                            Pessoa pessoaVd = new Pessoa(nome, vd);
                            pessoaVd.visualizar(pessoaVd);
                            break;
                    }

            } else {
                ativo = false;
            }
        } while (ativo);
    }
}
