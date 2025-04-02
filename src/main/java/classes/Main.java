package classes;

import javax.swing.JOptionPane;

public class Main {
    // aqui vai a logica do menu interativo, pode ser feito com joptionpane ou direto no console
    public static void main(String[] args) {
        int opcao = 0;

        do {
            opcao = exibeMenuPrincipal();

            switch (opcao) {
                case 1:
                    criaCaixa();
                    break;
                case 2:
                    criaVendedor();
                    break;
                case 3:
                    criaRepositor();
                    break;
                case 4:
                    criaSeguranca();
                    break;
                case 5:
                    criaFaxineiro();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Fechando o sistema...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (opcao != 6);
    }

    private static int exibeMenuPrincipal() {
        String menu = "*** Sistema de Gestão de Colaboradores ***\n" +
                "1. Criar funcionário do caixa\n" +
                "2. Criar vendedor\n" +
                "3. Criar repositor\n" +
                "4. Criar segurança\n" +
                "5. Criar faxineiro\n" +
                "6. Encerrar sistema\n\n" +
                "Escolha uma opção (1-6):";

        String input = JOptionPane.showInputDialog(menu);

        if (input == null) return 6; // Se clicar em 'cancelar' sai do popup/programa

        if (!input.matches("[1-6]")) { //regex é sempre uma mão na roda (ˊᗜˋ )
            JOptionPane.showMessageDialog(null, "Opção inválida. Digite um número entre 1 e 6.", "Erro", JOptionPane.ERROR_MESSAGE);
            return 0;
        }

        return Integer.parseInt(input);
    }

    private static void criaCaixa() {
        String nome = JOptionPane.showInputDialog("Nome do funcionário do caixa:");
        if (nome == null || nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome inválido. Será definido como vazio.", "Aviso", JOptionPane.WARNING_MESSAGE);
            nome = "";
        }

        String salarioStr = JOptionPane.showInputDialog("Salário fixo mensal (R$):");
        double salario = converteDouble(salarioStr); //feito dessa forma pois tem a verificação para caso seja menor q zero

        Caixa caixa = new Caixa(nome, salario);
        JOptionPane.showMessageDialog(null, "Funcionário criado com sucesso:\n" + caixa);
    }

    private static void criaVendedor() {
        String nome = JOptionPane.showInputDialog("Nome do vendedor:");
        if (nome == null || nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome inválido. Será definido como vazio.", "Aviso", JOptionPane.WARNING_MESSAGE);
            nome = "";
        }

        String salarioBaseStr = JOptionPane.showInputDialog("Salário base (R$):");
        double salarioBase = converteDouble(salarioBaseStr);

        String comissaoStr = JOptionPane.showInputDialog("Comissão por venda (R$):");
        double comissao = converteDouble(comissaoStr);

        String vendasStr = JOptionPane.showInputDialog("Quantidade de vendas:");
        int vendas = converteInt(vendasStr);

        Vendedor vendedor = new Vendedor(nome, salarioBase, comissao, vendas);
        JOptionPane.showMessageDialog(null, "Vendedor criado com sucesso:\n" + vendedor);
    }

    private static void criaRepositor() {
        String nome = JOptionPane.showInputDialog("Nome do repositor:");
        if (nome == null || nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome inválido. Será definido como vazio.", "Aviso", JOptionPane.WARNING_MESSAGE);
            nome = "";
        }

        String horasStr = JOptionPane.showInputDialog("Horas trabalhadas no mês:");
        double horas = converteDouble(horasStr);

        String valorHoraStr = JOptionPane.showInputDialog("Valor por hora (R$):");
        double valorHora = converteDouble(valorHoraStr);

        Repositor repositor = new Repositor(nome, horas, valorHora);
        JOptionPane.showMessageDialog(null, "Repositor criado com sucesso:\n" + repositor);
    }

    private static void criaSeguranca() {
        String nome = JOptionPane.showInputDialog("Nome do segurança:");
        if (nome == null || nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome inválido. Será definido como vazio.", "Aviso", JOptionPane.WARNING_MESSAGE);
            nome = "";
        }

        String salarioStr = JOptionPane.showInputDialog("Salário fixo (R$):");
        double salario = converteDouble(salarioStr);

        int noturno = JOptionPane.showConfirmDialog(null,
                "Trabalha no período noturno?", "Período", JOptionPane.YES_NO_OPTION);

        double adicional = 0;
        if (noturno == JOptionPane.YES_OPTION) {
            String adicionalStr = JOptionPane.showInputDialog("Adicional noturno (R$):");
            adicional = converteDouble(adicionalStr);
        }

        Seguranca seguranca = new Seguranca(nome, salario, noturno == JOptionPane.YES_OPTION, adicional);
        JOptionPane.showMessageDialog(null, "Segurança criado com sucesso:\n" + seguranca);
    }

    private static void criaFaxineiro() {
        String nome = JOptionPane.showInputDialog("Nome do faxineiro:");
        if (nome == null || nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome inválido. Será definido como vazio.", "Aviso", JOptionPane.WARNING_MESSAGE);
            nome = "";
        }

        String salarioStr = JOptionPane.showInputDialog("Salário fixo (R$):");
        double salario = converteDouble(salarioStr);

        String turnosStr = JOptionPane.showInputDialog("Quantidade de turnos extras:");
        int turnosExtras = converteInt(turnosStr);

        String bonusStr = JOptionPane.showInputDialog("Bônus por turno extra (R$):");
        double bonus = converteDouble(bonusStr);

        Faxineiro faxineiro = new Faxineiro(nome, salario, turnosExtras, bonus);
        JOptionPane.showMessageDialog(null, "Faxineiro criado com sucesso:\n" + faxineiro);
    }

    private static double converteDouble(String valorStr) {
        if (valorStr == null || valorStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Será definido como 0.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return 0;
        }

        // Verifica se é um número válido
        if (!valorStr.matches("-?\\d+(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(null, "Valor numérico inválido. Será definido como 0.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return 0;
        }

        double valor = Double.parseDouble(valorStr);
        return valor < 0 ? 0 : valor;
    }

    private static int converteInt(String valorStr) {
        if (valorStr == null || valorStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Será definido como 0.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return 0;
        }

        // Verifica se é um número inteiro válido
        if (!valorStr.matches("-?\\d+")) {
            JOptionPane.showMessageDialog(null, "Valor inteiro inválido. Será definido como 0.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return 0;
        }

        int valor = Integer.parseInt(valorStr);
        return valor < 0 ? 0 : valor;
    }
}
