import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Sistema de Gestão de Colaboradores ===");
            System.out.println("1. Criar Caixa");
            System.out.println("2. Criar Vendedor");
            System.out.println("3. Criar Repositor");
            System.out.println("4. Criar Segurança");
            System.out.println("5. Criar Faxineiro");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 6) {
                continuar = false;
                System.out.println("Sistema encerrado.");
                continue;
            }

            System.out.print("Digite o nome do funcionário: ");
            String nome = scanner.nextLine();

            Funcionario funcionario = null;
            switch (opcao) {
                case 1: // Caixa
                    System.out.print("Digite o salário fixo: ");
                    double salarioFixoCaixa = scanner.nextDouble();
                    funcionario = new Caixa(nome, salarioFixoCaixa);
                    break;
                case 2: // Vendedor
                    System.out.print("Digite o salário base: ");
                    double salarioBase = scanner.nextDouble();
                    System.out.print("Digite a comissão por venda: ");
                    double comissao = scanner.nextDouble();
                    System.out.print("Digite a quantidade de vendas: ");
                    int vendas = scanner.nextInt();
                    funcionario = new Vendedor(nome, salarioBase, comissao, vendas);
                    break;
                case 3: // Repositor
                    System.out.print("Digite o valor por hora: ");
                    double valorHora = scanner.nextDouble();
                    System.out.print("Digite as horas trabalhadas: ");
                    int horas = scanner.nextInt();
                    funcionario = new Repositor(nome, valorHora, horas);
                    break;
                case 4: // Segurança
                    System.out.print("Digite o salário fixo: ");
                    double salarioFixoSeg = scanner.nextDouble();
                    System.out.print("Trabalha no período noturno? (1 para sim, 0 para não): ");
                    boolean noturno = scanner.nextInt() == 1;
                    double adicional = 0;
                    if (noturno) {
                        System.out.print("Digite o adicional noturno: ");
                        adicional = scanner.nextDouble();
                    }
                    funcionario = new Seguranca(nome, salarioFixoSeg, noturno, adicional);
                    break;
                case 5: // Faxineiro
                    System.out.print("Digite o salário fixo: ");
                    double salarioFixoFax = scanner.nextDouble();
                    System.out.print("Digite o bônus por turno extra: ");
                    double bonus = scanner.nextDouble();
                    System.out.print("Digite a quantidade de turnos extras: ");
                    int turnos = scanner.nextInt();
                    funcionario = new Faxineiro(nome, salarioFixoFax, bonus, turnos);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            System.out.println("\n=== Informações do Funcionário ===");
            funcionario.exibirInformacoes();
        }
        scanner.close();
    }
}