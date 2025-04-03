package org.example;

import classes.*;

import static org.junit.jupiter.api.Assertions.*;

public class Test {
        // todo fazer os testes de cenario aqui nesse arquivo
    @org.junit.jupiter.api.Test
    void CaixaTest1(){
        //Initialize
        Caixa caixa = new Caixa();
        caixa.setNome("Vinicius");
        caixa.setSalario(1000);
        assertEquals(1000, caixa.getSalario());
    }
    @org.junit.jupiter.api.Test
    void CaixaTest2() {
        //Initialize
        Caixa caixa = new Caixa();
        caixa.setNome("Vinicius");
        caixa.setSalario(-1000);
        assertEquals(0, caixa.getSalario());
    }

    @org.junit.jupiter.api.Test
    void vendedorTest1(){
        //Initialize
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Vinicius");
        vendedor.setSalario(1000);
        vendedor.setQtComissao(10);
        vendedor.setVlComissao(100);
        //Asserts
        assertEquals(1000, vendedor.getSalario());
        assertEquals(10, vendedor.getQtComissao());
        assertEquals(100, vendedor.getVlComissao());
        assertEquals(2000, vendedor.vSalario());
    }
    @org.junit.jupiter.api.Test
     void vendedorTest2(){
        //Initialize
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Vinicius");
        vendedor.setSalario(-1000);
        vendedor.setQtComissao(-10);
        vendedor.setVlComissao(-100);
        //Asserts
        assertEquals(0, vendedor.getSalario());
        assertEquals(0, vendedor.getQtComissao());
        assertEquals(0, vendedor.getVlComissao());
        assertEquals(0, vendedor.vSalario());
    }

    @org.junit.jupiter.api.Test
    void repositorTest1(){
        //Initialize
        Repositor repositor = new Repositor();
        repositor.setNome("Vinicius");
        repositor.setSalario(25);
        repositor.setHoras(80);
        //Asserts
        assertEquals(25, repositor.getSalario());
        assertEquals(80, repositor.getHoras());
        assertEquals(2000, repositor.vSalario());
    }
    @org.junit.jupiter.api.Test
    void repositorTest2(){
        //Initialize
        Repositor repositor = new Repositor();
        repositor.setNome("Vinicius");
        repositor.setSalario(-25);
        repositor.setHoras(-80);
        //Asserts
        assertEquals(0, repositor.getSalario());
        assertEquals(1, repositor.getHoras());
        assertEquals(0, repositor.vSalario());
    }

    @org.junit.jupiter.api.Test
    void segurancaTest1(){
        Seguranca seguranca = new Seguranca();
        seguranca.setNome("Vinicius");
        seguranca.setSalario(1000);
        seguranca.setNoturno(true);
        seguranca.setVlNoturno(500);
        //Asserts
        assertEquals(1000, seguranca.getSalario());
        assertTrue(seguranca.isNoturno());
        assertEquals(500, seguranca.getVlNoturno());
        assertEquals(1500, seguranca.vSalario());
    }
    @org.junit.jupiter.api.Test
    void segurancaTest2(){
        Seguranca seguranca = new Seguranca();
        seguranca.setNome("Vinicius");
        seguranca.setSalario(-1000);
        seguranca.setNoturno(false);
        seguranca.setVlNoturno(-500);
        //Asserts
        assertEquals(0, seguranca.getSalario());
        assertFalse(seguranca.isNoturno());
        assertEquals(0, seguranca.getVlNoturno());
        assertEquals(0, seguranca.vSalario());
    }

    @org.junit.jupiter.api.Test
    void faxineiroTest1(){
        Faxineiro faxineiro = new Faxineiro();
        faxineiro.setNome("Vinicius");
        faxineiro.setSalario(1000);
        faxineiro.setTurno(2);
        faxineiro.setVlTurno(500);
        //Asserts
        assertEquals(1000, faxineiro.getSalario());
        assertEquals(2, faxineiro.getTurno());
        assertEquals(500, faxineiro.getVlTurno());
        assertEquals(2000, faxineiro.vSalario());
    }
    @org.junit.jupiter.api.Test
    void faxineiroTest2(){
        Faxineiro faxineiro = new Faxineiro();
        faxineiro.setNome("Vinicius");
        faxineiro.setSalario(-1000);
        faxineiro.setTurno(-2);
        faxineiro.setVlTurno(-500);
        //Asserts
        assertEquals(0, faxineiro.getSalario());
        assertEquals(0, faxineiro.getTurno());
        assertEquals(0, faxineiro.getVlTurno());
        assertEquals(0, faxineiro.vSalario());
    }
}
