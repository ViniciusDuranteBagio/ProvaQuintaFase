import java.util.Scanner;

abstract class Funcionario {
    protected String nome;
    protected double salarioFinal;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract void calcularSalario();

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.printf("Salário Final: R$ %.2f%n", salarioFinal);
    }

    protected static double validarValor(double valor, String tipo) {
        if (valor < 0) {
            System.out.println("Valor inválido para " + tipo + ". Definindo como 0.");
            return 0;
        }
        return valor;
    }

    protected static int validarValor(int valor, String tipo) {
        if (valor < 0) {
            System.out.println("Valor inválido para " + tipo + ". Definindo como 0.");
            return 0;
        }
        return valor;
    }
}