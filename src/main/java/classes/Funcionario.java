package classes;

import java.util.Scanner;

public abstract class Funcionario{
    protected String nome;
    protected double salario;

    //Getter & Setters
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
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("!Valor, não permitido. Definido como 0!");
            this.salario = 0;
        }
    }
}

