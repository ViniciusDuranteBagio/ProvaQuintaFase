package classes;

public class Func_Caixa extends Funcionario {
    public Func_Caixa(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}
