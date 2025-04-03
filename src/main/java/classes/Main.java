package classes;

import java.util.Scanner;

public class Main {
    // aqui vai a logica do menu interativo, pode ser feito com joptionpane ou direto no console
    public static void main(String[] args) {
        Menu();
    }
    //Methods
    public static void Menu() {
        int opcao;
        do {
            System.out.println("Menu" +
                    "\n!Cadastrar!" +
                    "\nCaixa (1)" +
                    "\nVendedor (2)" +
                    "\nRepositor (3)" +
                    "\nSegurança (4)" +
                    "\nFaxineiro (5)" +
                    "\nSair (6)");
            opcao = Escolha();
            switch (opcao) {
                case 1:
                    Caixa caixa = new Caixa();
                    caixa.cadastrar();
                    System.out.println(caixa);
                    break;

                case 2:
                    Vendedor vendedor = new Vendedor();
                    vendedor.cadastrar();
                    System.out.println(vendedor);
                    break;

                case 3:
                    Repositor repositor = new Repositor();
                    repositor.cadastrar();
                    System.out.println(repositor);
                    break;

                case 4:
                    Seguranca seguranca = new Seguranca();
                    seguranca.cadastrar();
                    System.out.println(seguranca);
                    break;

                case 5:
                    Faxineiro faxineiro = new Faxineiro();
                    faxineiro.cadastrar();
                    System.out.println(faxineiro);
                    break;
            }
        } while (opcao != 6);
    }

    public static int Escolha() {
        Scanner scanner = new Scanner(System.in);
        int opcao = Integer.parseInt((scanner.nextLine()));
        if (opcao > 0 && opcao <= 6) {
            return opcao;
        } else {
            return 6;
        }
    }
}
