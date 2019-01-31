package br.gov.serpro.caixa24h;

import br.gov.serpro.bancoalfa.BancoAlfa;
import br.gov.serpro.bancoalfa.ContaComum;
import br.gov.serpro.bancoalfa.ContaEspecial;
import br.gov.serpro.exception.OperacaoInvalidaException;
import br.gov.serpro.exception.SaldoInsuficienteException;
import br.gov.serpro.exception.TransferenciaInvalidaException;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class BancoAlfaTest {
	
	private BancoAlfa bancoAlfa;
	private ContaComum contaComum;
	private ContaComum contaComumDois;
	private ContaEspecial contaEspecial;
	private ContaEspecial contaEspecialDois;
	
	@Before
	public void before() {
		bancoAlfa = new BancoAlfa("Renato",1L);
		contaComum = new ContaComum (new BigDecimal(1000),"Comum 1");						       
		contaComumDois = new ContaComum (new BigDecimal(500),"Comum 2");
		contaEspecial = new ContaEspecial (new BigDecimal(1000),"Especial 1");						       
		contaEspecialDois = new ContaEspecial (new BigDecimal(500),"Especial 2");
	}
	

	@Test
	public void testSacarComSucesso(){
    try {
		bancoAlfa.sacar(new BigDecimal(500), contaComum);
	} catch (SaldoInsuficienteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch(OperacaoInvalidaException e2) {
		e2.printStackTrace();
	}
    assertEquals(new BigDecimal(500),contaComum.getSaldo());
	}
	
	
		
	@Test(expected = SaldoInsuficienteException.class)
	public void testSacarEspecialComSaldoInsuficiente(){
	try {
		bancoAlfa.sacar(new BigDecimal(500), contaEspecial);
	    } catch (SaldoInsuficienteException e ){
		  e.printStackTrace();
	    } catch (OperacaoInvalidaException e2) {
   		  e2.printStackTrace();
	    }
	}

			
	@Test
	public void testTransferirValorEspecialComSucesso(){
		try {
			bancoAlfa.transferirValor(new BigDecimal(300), contaEspecialDois, contaEspecial);
		} catch (TransferenciaInvalidaException e ){
			e.printStackTrace();
		} catch (SaldoInsuficienteException e2) {
			e2.printStackTrace();
		}
		assertEquals(new BigDecimal(800),contaEspecialDois.getSaldo());		
		assertEquals(new BigDecimal(700),contaEspecial.getSaldo());
	}

	
	@Test(expected = OperacaoInvalidaException.class)
	public void testDepositoComErro(){
		try {
			bancoAlfa.depositar(new BigDecimal(500), contaComum);
		} catch (OperacaoInvalidaException e){
			e.printStackTrace();
		}
	}
	
	@Test(expected = OperacaoInvalidaException.class)
	public void testQuantidadeOperacoesUltrapassado(){
		try {
			bancoAlfa.sacar(new BigDecimal(100), contaComum);
			bancoAlfa.sacar(new BigDecimal(100), contaComum);
			bancoAlfa.sacar(new BigDecimal(100), contaComum);
			bancoAlfa.sacar(new BigDecimal(100), contaComum);
		} catch (SaldoInsuficienteException e) {
		  e.printStackTrace();
	    } catch(OperacaoInvalidaException e2) {
		  e2.printStackTrace();
	    }
	}
}