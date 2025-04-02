package classes.Davi;

public class Funcionario {
    protected String nome;
    protected double salario;
    protected String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public static double validarValor(double valor) {
        if (valor < 0) {
            System.out.println("Valor inferior a 0. Será setado 0");   //criei esse método para ficar repetindo nas
            return 0;                                                  //outras classes extends
        }
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = validarValor(salario);
    }

    public String getCargo() {
        return cargo;
    }
}