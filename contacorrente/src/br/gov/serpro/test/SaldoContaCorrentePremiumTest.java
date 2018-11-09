package br.gov.serpro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.gov.serpro.conta.ContaCorrente;
import br.gov.serpro.conta.ContaCorrentePremium;

public class SaldoContaCorrentePremiumTest {

    @Test
    public void deveSerIgualA106PorcentoDaSomaDosValoresDepositados() {

        // Given
        ContaCorrente contaCorrente = new ContaCorrentePremium();
        contaCorrente.depositar(50.0);
        contaCorrente.depositar(100.0);

        // When
        double saldo = contaCorrente.obterSaldo();

        // Then
        assertEquals(159, saldo, 0);
    }

}
