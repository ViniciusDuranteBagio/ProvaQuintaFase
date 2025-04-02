package classes;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        while (true) {
            String menu = "Tipo de funcionário:\n"
                    + "1 - Caixa\n"
                    + "2 - Vendedor\n"
                    + "3 - Repositor\n"
                    + "4 - Segurança\n"
                    + "5 - Faxineiro\n"
                    + "0 - Sair";

            String escolhaStr = JOptionPane.showInputDialog(menu);
            int escolha = Integer.parseInt(escolhaStr);

            if (escolha == 0) {
                JOptionPane.showMessageDialog(null, "Encerrou.");
                break;
            }

            String nome;
            double salarioFixo, comissao, horasTrabalho, valorHora, addNoturno, bonusTurno;
            int numeroVendas, turnosExtras;

            Funcionario funcionario = null;

            switch (escolha) {
                case 1:
                    nome = JOptionPane.showInputDialog("Nome do Caixa: ");
                    salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Salário fixo: "));
                    funcionario = new Caixa(nome, salarioFixo);
                    break;
                case 2:
                    nome = JOptionPane.showInputDialog("Nome do Vendedor: ");
                    salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Salário base: "));
                    comissao = Double.parseDouble(JOptionPane.showInputDialog("Comissão por venda: "));
                    numeroVendas = Integer.parseInt(JOptionPane.showInputDialog("Número de vendas: "));
                    funcionario = new Vendedor(nome, salarioFixo, comissao, numeroVendas);
                    break;
                case 3:
                    nome = JOptionPane.showInputDialog("Nome do Repositor: ");
                    valorHora = Double.parseDouble(JOptionPane.showInputDialog("Valor por hora: "));
                    horasTrabalho = Double.parseDouble(JOptionPane.showInputDialog("Horas trabalhadas: "));
                    funcionario = new Repositor(nome, valorHora, horasTrabalho);
                    break;
                case 4:
                    nome = JOptionPane.showInputDialog("Nome do Segurança: ");
                    salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Salário fixo: "));
                    addNoturno = Double.parseDouble(JOptionPane.showInputDialog("Adicional noturno: "));
                    funcionario = new Seguranca(nome, salarioFixo, addNoturno);
                    break;
                case 5:
                    nome = JOptionPane.showInputDialog("Nome do Faxineiro: ");
                    salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Salário fixo: "));
                    bonusTurno = Double.parseDouble(JOptionPane.showInputDialog("Bônus por turno extra: "));
                    turnosExtras = Integer.parseInt(JOptionPane.showInputDialog("Número de turnos extras: "));
                    funcionario = new Faxineiro(nome, salarioFixo, bonusTurno, turnosExtras);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalido.");
                    continue;
            }

            funcionario.calcularSalario();

            JOptionPane.showMessageDialog(null,
                    "Nome: " + funcionario.getNome() + "\nSalário: " + funcionario.getSalario());
        }
    }
}
