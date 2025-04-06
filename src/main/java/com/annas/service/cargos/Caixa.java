package com.annas.service.cargos;

public class Caixa extends Cargo {

    public Caixa(String descricao, String turno, double salarioBase){
        super(descricao, turno, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }
}
