package com.annas.service.cargos;

import javax.swing.*;

public abstract class Cargo {
    private String descricao;
    private String turno;
    private double salarioBase;

    public Cargo(String descricao, String turno, double salarioBase){
        this.descricao = descricao;
        this.turno = turno;
        this.salarioBase = salarioBase;
    }

    // Construtor vazio
    public Cargo(){}


    //  Construtor para calcular Sálario
    public abstract double calcularSalario();

    //Getter e Setter
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
            this.salarioBase = salarioBase;
    }
}
