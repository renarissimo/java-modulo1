package br.gov.serpro.caixa24h;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import br.gov.serpro.banco.Conta;
import br.gov.serpro.bancoalfa.BancoAlfa;
import br.gov.serpro.bancoalfa.ContaComum;
import br.gov.serpro.exception.OperacaoInvalidaException;
import br.gov.serpro.exception.SaldoInsuficienteException;
import br.gov.serpro.exception.TransferenciaInvalidaException;

public class BancoAlfaTest {
	
	private BancoAlfa bancoAlfa;
	private ContaComum contaComum;
	private ContaComum contaComumDois;
	
	@Before
	public void before() {
		bancoAlfa = new BancoAlfa("Renato",1L);
		contaComum = new ContaComum (new BigDecimal(1000),"Comum 1");						       
		contaComumDois = new ContaComum (new BigDecimal(500),"Comum 2");
	}
	

	@Test
	public void testSacarUm() throws Exception {
    try {
		bancoAlfa.sacar(new BigDecimal(500), contaComum);
	} catch (SaldoInsuficienteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    assertEquals(new BigDecimal(500),contaComum.getSaldo());
	}
	
	@Test
	public void testTransferirValorUm() {
		//transferirValor(BigDecimal valorATransferir, Conta contaDestino, Conta conta)
		try {
			bancoAlfa.transferirValor(new BigDecimal(200), contaComumDois, contaComum);
		} catch (TransferenciaInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(new BigDecimal(700),contaComumDois.getSaldo());		
	}
	
	@Test(expected = OperacaoInvalidaException.class)
	public void testDeposito() throws OperacaoInvalidaException {		
			bancoAlfa.depositar(new BigDecimal(500), contaComum);		
	}
	
	@Test(expected = OperacaoInvalidaException.class)
	public void testQuantidadeOperacoes() throws SaldoInsuficienteException, Exception {
		bancoAlfa.sacar(new BigDecimal(100), contaComum);
		bancoAlfa.sacar(new BigDecimal(100), contaComum);
		bancoAlfa.sacar(new BigDecimal(100), contaComum);
		bancoAlfa.sacar(new BigDecimal(100), contaComum);
	}
	
	

}