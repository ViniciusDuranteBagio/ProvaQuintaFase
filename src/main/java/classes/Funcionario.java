package classes;

public class Funcionario {

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

    public void calcularSalario(double salarioCalc) {
        this.salario = salarioCalc;
    };

    public double validarValor(double valor) {
        if (valor < 0) {
            System.out.println("Valor inválido. O valor será definido como 0.");
            return 0.0;
        }
        return valor;
    }

}
