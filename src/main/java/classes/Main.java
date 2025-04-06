package classes;

import javax.swing.*;

public class Main {
    // aqui vai a logica do menu interativo, pode ser feito com joptionpane ou direto no console
    public static void main(String[] args) {

        int opcao = 0;

        while (opcao != 4) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Cadastrar Caixa\n"+
                            "2 - Cadastrar Repositor\n" +
                            "3 - Cadastrar Faxineiro\n" +
                            "4 - Cadastrar Segurança\n" +
                            "5 - Sair\n" ));
            switch (menu) {

                case 1:
                    String nomeCaixa = JOptionPane.showInputDialog("Digite o nome do caixa:");
                    double salarioFixoCaixa = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario fixo do caixa:"));
                    if (salarioFixoCaixa < 0) {
                        JOptionPane.showMessageDialog(null, "Salario fixo não pode ser negativo!");
                        break;
                    }
                    Caixa caixa = new Caixa(nomeCaixa, salarioFixoCaixa);
                    JOptionPane.showMessageDialog(null, caixa.toString());
                    break;
                case 2:
                    String nomeRepositor = JOptionPane.showInputDialog("Digite o nome do repositor:");
                    double valorPorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora do repositor:"));
                    int horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas:"));
                    if (valorPorHora < 0 || horasTrabalhadas < 0) {
                        JOptionPane.showMessageDialog(null, "Valor por hora e horas trabalhadas não podem ser negativos!");
                        break;
                    }
                    Repositor repositor = new Repositor(nomeRepositor, valorPorHora, horasTrabalhadas);
                    JOptionPane.showMessageDialog(null, repositor.toString());
                    break;
                case 3:
                    String nomeFaxineiro = JOptionPane.showInputDialog("Digite o nome do faxineiro:");
                    double salarioFixoFaxineiro = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario fixo do faxineiro:"));
                    double bonusPorTurno = Double.parseDouble(JOptionPane.showInputDialog("Digite o bonus por turno do faxineiro:"));
                    int qdtTurnosExtras = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de turnos extras:"));
                    if (salarioFixoFaxineiro < 0 || bonusPorTurno < 0 || qdtTurnosExtras < 0) {
                        JOptionPane.showMessageDialog(null, "Salario fixo, bonus por turno e quantidade de turnos extras não podem ser negativos!");
                        break;
                    }
                    Faxineiro faxineiro = new Faxineiro(nomeFaxineiro, salarioFixoFaxineiro, bonusPorTurno, qdtTurnosExtras);
                    JOptionPane.showMessageDialog(null, faxineiro.toString());
                    break;
                case 4:
                    String nomeVendedor = JOptionPane.showInputDialog("Digite o nome do vendedor:");
                    double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario base do vendedor:"));
                    double comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite a comissao do vendedor:"));
                    int qtdVendas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vendas:"));
                    if (salarioBase < 0 || comissao < 0 || qtdVendas < 0) {
                        JOptionPane.showMessageDialog(null, "Salario base, comissao e quantidade de vendas não podem ser negativos!");
                        break;
                    }
                    Vendedor vendedor = new Vendedor(nomeVendedor, salarioBase, comissao, qtdVendas);
                    JOptionPane.showMessageDialog(null, vendedor.toString());
                    break;
                case 5:
                    opcao = 4;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida!");
                    break;



            }


        }
    }
}
