package com.annas.service.cargos;

import javax.swing.*;

public class Faxineiro extends Cargo{
    private double turnoExtra;
    private double bonus;

    public Faxineiro(String descricao, String turno, double turnosExtras, double salarioBase, double bonus){
        super(descricao, turno, salarioBase);
            this.turnoExtra = turnosExtras;
            this.bonus = bonus;

            setSalarioBase(calcularSalario());
    }


    @Override
    public double calcularSalario() {
        return getSalarioBase() + (turnoExtra * bonus);
    }
}
