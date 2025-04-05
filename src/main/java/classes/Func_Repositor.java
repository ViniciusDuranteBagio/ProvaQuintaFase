package classes;

public class Func_Repositor extends Funcionario {
    private double vlHora;
    private int horas;

    public Func_Repositor(String nome, double vlHora, int horas) {
        super(nome, 0); // salario é zero pq eles são pagos por hora de trabalho e não há salario fixo
        this.vlHora = validarValor(vlHora);
        this.horas = Math.max(horas, 0); //"max" impede que a quantidade de horas seja negativa e, se for, vira zero
    }

    @Override
    public double calcularSalario() {
        return vlHora * horas;
    }
}
