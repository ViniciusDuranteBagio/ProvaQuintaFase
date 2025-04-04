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

    public double getSalario() {
        return salario;
    }

    public abstract void calcularSalario();

    protected double validarValor(String campo, double valor) {
        if (valor < 0) {
            JOptionPane.showMessageDialog(null, campo + " não pode ser negativo. Valor ajustado para 0.");
            return 0.0;
        }
        return valor;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSalário final: R$ " + String.format("%.2f", salario);
    }
}
