package com.annas.service.cargos;

public class Vendedor extends Cargo{
    private double qtdVendas;
    private double comissao;

    public Vendedor(String descricao, String turno, double salarioBase, double qtdVendas, double comissao){
        super(descricao, turno, salarioBase);
        this.qtdVendas = qtdVendas;
        this.comissao = comissao;
        setSalarioBase(calcularSalario());
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() +  (qtdVendas * comissao);
    }
}
