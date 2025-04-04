package classes;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        while (true) {
            String menu = "Escolha o tipo de funcionário:\n"
                    + "1 - Caixa\n"
                    + "2 - Vendedor\n"
                    + "3 - Repositor\n"
                    + "4 - Segurança\n"
                    + "5 - Faxineiro\n"
                    + "0 - Sair";
            int escolha = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (escolha == 0) {
                JOptionPane.showMessageDialog(null, "Sistema encerrado.");
                break;
            }

            String nome = JOptionPane.showInputDialog("Digite o nome:");

            Funcionario funcionario = null;

            switch (escolha) {
                case 1: {
                    double salarioFixo = lerDouble("Salário fixo:");
                    funcionario = new Caixa(nome, salarioFixo);
                    break;
                }
                case 2: {
                    double salarioBase = lerDouble("Salário base:");
                    double comissao = lerDouble("Comissão por venda:");
                    int vendas = lerInt("Quantidade de vendas:");
                    funcionario = new Vendedor(nome, salarioBase, comissao, vendas);
                    break;
                }
                case 3: {
                    double valorHora = lerDouble("Valor por hora:");
                    double horas = lerDouble("Horas trabalhadas:");
                    funcionario = new Repositor(nome, valorHora, horas);
                    break;
                }
                case 4: {
                    double salario = lerDouble("Salário fixo:");
                    double adicional = lerDouble("Adicional noturno (coloque 0 se não houver):");
                    funcionario = new Seguranca(nome, salario, adicional);
                    break;
                }
                case 5: {
                    double salario = lerDouble("Salário fixo:");
                    double bonus = lerDouble("Bônus por turno extra:");
                    int turnos = lerInt("Quantidade de turnos extras:");
                    funcionario = new Faxineiro(nome, salario, bonus, turnos);
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }

            if (funcionario != null) {
                funcionario.calcularSalario();
                JOptionPane.showMessageDialog(null, funcionario.toString());
            }
        }
    }

    public static double lerDouble(String mensagem) {
        try {
            return Double.parseDouble(JOptionPane.showInputDialog(mensagem));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Será considerado 0.");
            return 0.0;
        }
    }

    public static int lerInt(String mensagem) {
        try {
            return Integer.parseInt(JOptionPane.showInputDialog(mensagem));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Será considerado 0.");
            return 0;
        }
    }
}
