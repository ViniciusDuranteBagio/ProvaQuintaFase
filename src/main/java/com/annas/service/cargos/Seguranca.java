package com.annas.service.cargos;

public class Seguranca extends Cargo{
    private double ADDNOTURNO = 1.20;

    public Seguranca(String descricao, String turno, double salarioBase){
        super(descricao, turno, salarioBase);
        setSalarioBase(calcularSalario());
    }


    @Override
    public double calcularSalario() {
        double salarioFinal;
        if (getTurno().equalsIgnoreCase("Noturno")){
            return getSalarioBase() * ADDNOTURNO;
        }else{
            return getSalarioBase();
        }
    }
}
