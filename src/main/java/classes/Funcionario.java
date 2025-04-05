package classes;

import javax.swing.*;

abstract class Funcionario { // classe abstrata usada como base para os funcionarios -- evita ser instanciada diretamente
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularSalario();

    protected double validarValor(double valor) {
        if (valor < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido!\nSe for negativo, vai ser definido como 0");
            return 0;
        }
        return valor;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n Salario: R$ " + calcularSalario();
    }
}
