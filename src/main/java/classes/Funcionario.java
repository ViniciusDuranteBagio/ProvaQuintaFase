package classes;

import javax.swing.JOptionPane;

public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome) {
        this.nome = nome;
        this.salario = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract void calcularSalario();

    public double validarValor(double valor) {
        if (valor < 0) {
            JOptionPane.showMessageDialog(null, "Não pode ser negativo. Salário = 0");
            return 0.0;
        }
        return valor;
    }
}
