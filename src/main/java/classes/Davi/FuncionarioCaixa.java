package classes.Davi;

public class FuncionarioCaixa extends Funcionario {

    public FuncionarioCaixa(String nome, double salario) {
        super(nome, "Caixa");
        this.salario = validarValor(salario); //Na criação já pega o erro.

    }

    public double calcularSalario() {
        return salario;
    }
}