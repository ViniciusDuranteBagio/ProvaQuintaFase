package classes;

import javax.swing.*;

public class Menu {
    Cadastro cadastro = new Cadastro();

    public void exibirMenu() {
        while (true) {
            String opcao = JOptionPane.showInputDialog("Menu:\n" +
                    "1. Adicionar Caixa\n" +
                    "2. Adicionar Vendedor\n" +
                    "3. Adicionar Repositor\n" +
                    "4. Adicionar Segurança\n" +
                    "5. Adicionar Faxineiro\n" +
                    "6. Sair");

            if (opcao == null || opcao.equals("6")) break;

            switch (opcao) {
                case "1":
                    cadastro.adicionarCaixa();
                    break;
                case "2":
                    cadastro.adicionarVendedor();
                    break;
                case "3":
                    cadastro.adicionarRepositor();
                    break;
                case "4":
                    cadastro.adicionarSeguranca();
                    break;
                case "5":
                    cadastro.adicionarFaxineiro();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}



