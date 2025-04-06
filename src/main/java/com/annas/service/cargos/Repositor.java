package com.annas.service.cargos;

public class Repositor extends Cargo{
    private double qtdHorasTrabalhadas;
    private double valorHora;

    public Repositor(String descricao, String turno, double qtdHorasTrabalhadas, double valorHora){
        super(descricao, turno, 0);
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHora = valorHora;
         setSalarioBase(calcularSalario());
    }

    @Override
    public double calcularSalario() {
        return qtdHorasTrabalhadas * valorHora;
    }

}
