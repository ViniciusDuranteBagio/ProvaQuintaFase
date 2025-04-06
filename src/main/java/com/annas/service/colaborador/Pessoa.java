package com.annas.service.colaborador;

import com.annas.service.cargos.Cargo;

import javax.swing.*;

public class Pessoa {
    private String nome;
    private Cargo cargo;

    public Pessoa(String nome, Cargo cargo){
        this.nome = nome;
        this.cargo = cargo;
    }
    public Pessoa(){
    }

    public void visualizar(Pessoa pessoa){
        JOptionPane.showMessageDialog(null,
                "Nome: " + nome + "\n" +
                        "Cargo: " + cargo.getDescricao() + "\n" +
                        "Turno: " + cargo.getTurno() + "\n" +
                        "Sálario: " + cargo.getSalarioBase() + "\n"
        );
    }

    public Cargo getCargo() {
        return cargo;
    }

    public String getNome() {
        return nome;
    }
}
