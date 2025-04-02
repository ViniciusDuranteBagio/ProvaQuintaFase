package classes.Davi;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class MainFuncionario {

    public static void main(String[] args) {
        boolean continuar = true;

        // Lista para armazenar os funcionários
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        while (continuar) {
            String menu = "Escolha uma opção:\n" +
                    "1. Criar funcionário do caixa\n" +
                    "2. Criar vendedor\n" +
                    "3. Criar repositor\n" +
                    "4. Criar segurança\n" +
                    "5. Criar faxineiro\n" +
                    "6. Exibir todos os funcionários\n" +
                    "7. Sair";

            String opcao = JOptionPane.showInputDialog(menu);

            switch (opcao) {
                case "1":
                    criarFuncionarioCaixa(funcionarios);
                    break;
                case "2":
                    criarFuncionarioVendedor(funcionarios);
                    break;
                case "3":
                    criarFuncionarioRepositor(funcionarios);
                    break;
                case "4":
                    criarFuncionarioSeguranca(funcionarios);
                    break;
                case "5":
                    criarFuncionarioFaxineiro(funcionarios);
                    break;
                case "6":
                    exibirFuncionarios(funcionarios);
                    break;
                case "7":
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }

    private static void criarFuncionarioCaixa(ArrayList<Funcionario> funcionarios) {
        String nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário:"));
        FuncionarioCaixa caixa = new FuncionarioCaixa(nome, salario);
        funcionarios.add(caixa);  // Armazenando o funcionário na lista
        exibirInformacoesFuncionario(caixa);
    }

    private static void criarFuncionarioVendedor(ArrayList<Funcionario> funcionarios) {
        String nome = JOptionPane.showInputDialog("Digite o nome do vendedor:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base:"));
        double comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da comissão por venda:"));
        int vendas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de vendas realizadas:"));
        FuncionarioVendedor vendedor = new FuncionarioVendedor(nome, salario, comissao, vendas);
        funcionarios.add(vendedor);
        exibirInformacoesFuncionario(vendedor);
    }

    private static void criarFuncionarioRepositor(ArrayList<Funcionario> funcionarios) {
        String nome = JOptionPane.showInputDialog("Digite o nome do repositor:");
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada:"));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de horas trabalhadas:"));
        FuncionarioRepositor repositor = new FuncionarioRepositor(nome, valorHora, horas);
        funcionarios.add(repositor);
        exibirInformacoesFuncionario(repositor);
    }

    private static void criarFuncionarioSeguranca(ArrayList<Funcionario> funcionarios) {
        String nome = JOptionPane.showInputDialog("Digite o nome do segurança:");
        double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base:"));
        int trabalhouNoite = JOptionPane.showConfirmDialog(null, "O segurança trabalhou no período noturno?", "Trabalho noturno", JOptionPane.YES_NO_OPTION);
        boolean trabalhouNoiteBool = trabalhouNoite == JOptionPane.YES_OPTION;    // para bater com ternário
        FuncionarioSeguranca seguranca = new FuncionarioSeguranca(nome, salarioBase, trabalhouNoiteBool);
        funcionarios.add(seguranca);
        exibirInformacoesFuncionario(seguranca);
    }

    private static void criarFuncionarioFaxineiro(ArrayList<Funcionario> funcionarios) {
        String nome = JOptionPane.showInputDialog("Digite o nome do faxineiro:");
        double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base:"));
        int turnosExtras = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de turnos extras:"));
        double bonusTurno = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do bônus por turno extra:"));
        FuncionarioFaxineiro faxineiro = new FuncionarioFaxineiro(nome, salarioBase, turnosExtras, bonusTurno);
        funcionarios.add(faxineiro);
        exibirInformacoesFuncionario(faxineiro);
    }

    private static void exibirFuncionarios(ArrayList<Funcionario> funcionarios) {
        StringBuilder info = new StringBuilder();
        for (Funcionario funcionario : funcionarios) {
            info.append("Nome: ").append(funcionario.getNome()).append("\n");
            info.append("Salário: ").append(funcionario.getSalario()).append("\n");
            info.append ("Cargo: ").append(funcionario.getCargo()).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, info.toString());
    }

    private static void exibirInformacoesFuncionario(Funcionario funcionario) {
        String info = "Nome: " + funcionario.getNome() + "\n" +
                "Salário: " + funcionario.getSalario() + "\n" +
                "Cargo: " + funcionario.getCargo() + "\n";
        JOptionPane.showMessageDialog(null, info);
    }
}