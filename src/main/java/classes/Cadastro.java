package classes;

import javax.swing.*;

public class Cadastro {
    public void adicionarCaixa() {
        String nome = JOptionPane.showInputDialog("Nome:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário fixo:"));
        JOptionPane.showMessageDialog(null, new Func_Caixa(nome, salario));
    }

    public void adicionarVendedor() {
        String nome = JOptionPane.showInputDialog("Nome:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário base:"));
        double comissao = Double.parseDouble(JOptionPane.showInputDialog("Comissão por venda:"));
        int vendas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de vendas:"));
        JOptionPane.showMessageDialog(null, new Func_Vendedor(nome, salario, comissao, vendas));
    }

    public void adicionarRepositor() {
        String nome = JOptionPane.showInputDialog("Nome:");
        double vlHora = Double.parseDouble(JOptionPane.showInputDialog("Valor por hora:"));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas trabalhadas:"));
        JOptionPane.showMessageDialog(null, new Func_Repositor(nome, vlHora, horas));
    }

    public void adicionarSeguranca() {
        String nome = JOptionPane.showInputDialog("Nome:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário fixo:"));
        double adicionalNoturno = Double.parseDouble(JOptionPane.showInputDialog("Adicional noturno:"));
        boolean turnoDaNoite = JOptionPane.showConfirmDialog(null, "Trabalha à noite?", "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        JOptionPane.showMessageDialog(null, new Func_Seguranca(nome, salario, adicionalNoturno, turnoDaNoite));
    }

    public void adicionarFaxineiro() {
        String nome = JOptionPane.showInputDialog("Nome:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário fixo:"));
        double bonusTurnosExtra = Double.parseDouble(JOptionPane.showInputDialog("Bônus por turno extra:"));
        int qntTurnosExtra = Integer.parseInt(JOptionPane.showInputDialog("Turnos extras:"));
        JOptionPane.showMessageDialog(null, new Func_Faxineiro(nome, salario, bonusTurnosExtra, qntTurnosExtra));
    }
}
