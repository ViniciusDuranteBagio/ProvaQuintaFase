package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import classes.application.Main;
import classes.entities.Cashier;
import classes.entities.Janitor;
import classes.entities.Salesperson;
import classes.entities.SecurityGuard;
import classes.entities.Stocker;

public class mainTest {

    public void Teste() {
        // todo fazer os testes de cenario aqui nesse arquivo
        assertEquals(true, true);
    }

    @Test
    public void testCreateCashierWithValidSalary() {
        assertEquals(new Cashier("Abel", 1000).calculateSalary(), 1000);
    }

    @Test
    public void testCreateSalespersonWithValidSalary() {
        assertEquals(new Salesperson("Bruna", 1000, 2000).calculateSalary(), 1100);
    }

    @Test
    public void testCreateStockerWithValidSalary() {
        assertEquals(new Stocker("Cirilo", 40).calculateSalary(), 1200);
    }

    @Test
    public void testCreateSecurityGuardWithNightShiftAndValidSalary() {
        assertEquals(new SecurityGuard("Diana", 1000, true).calculateSalary(), 1250);
    }

    @Test
    public void testCreateSecurityGuardWithoutNightShiftAndWithValidSalary() {
        assertEquals(new SecurityGuard("Diana", 1000, false).calculateSalary(), 1000);
    }

    @Test
    public void testCreateJanitorWithExtraShiftsAndValidSalary() {
        assertEquals(new Janitor("Ednaldo", 1000, 5).calculateSalary(), 1500);
    }

    @Test
    public void testCreateJanitorWithoutExtraShiftsAndWithValidSalary() {
        assertEquals(new Janitor("Ednaldo", 1000, 0).calculateSalary(), 1000);
    }

    @Test
    public void testeCreateEmployeeWithNegativeSalary() {
        Cashier c = new Cashier("Fernanda", -1);
        assertEquals(Main.validateValue(c.getFixedSalary()), 0);
    }

    @Test
    public void testeCreateEmployeeWithNegativeComission() {
        Salesperson s = new Salesperson("Gabriel", 1000, -1);
        assertEquals(Main.validateValue(s.getSalesThisMonth()), 0);
    }

    @Test
    public void testeCreateEmployeeWithNegativeHours() {
        Stocker s = new Stocker("Helena", -1);
        assertEquals(Main.validateValue(s.getWorkedHours()), 0);
    }

    @Test
    public void testeCreateEmployeeWithNegativeExtraShifts() {
        Janitor j = new Janitor("Iago", 1000, -1);
        assertEquals(Main.validateValue(j.getExtraShifts()), 0);
    }



}
