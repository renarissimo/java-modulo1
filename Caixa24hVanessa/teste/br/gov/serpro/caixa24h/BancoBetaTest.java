package br.gov.serpro.caixa24h;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import br.gov.serpro.bancobeta.BancoBeta;
import br.gov.serpro.bancobeta.ContaComum;
import br.gov.serpro.bancobeta.ContaPremium;
import br.gov.serpro.exception.OperacaoInvalidaException;
import br.gov.serpro.exception.SaldoInsuficienteException;
import br.gov.serpro.exception.TransferenciaInvalidaException;

public class BancoBetaTest {
	
	private BancoBeta bancoBeta;
	private BancoBeta bancoBetaDois;
	private ContaComum contaComum;
	private ContaComum contaComumDois;
	private ContaPremium contaPremium;
	private ContaPremium contaPremiumDois;
	
	@Before
	public void before() {
		bancoBeta = new BancoBeta("Renato",1L);
		contaComum = new ContaComum (new BigDecimal(1000),"Comum 1");						       
		contaComumDois = new ContaComum (new BigDecimal(500),"Comum 2");
		bancoBetaDois = new BancoBeta("Sabrina",1L);
		contaPremium = new ContaPremium (new BigDecimal(1000),"Especial 1");						       
		contaPremiumDois = new ContaPremium (new BigDecimal(500),"Especial 2");
	}
	

	@Test
	public void testSacarUm() throws SaldoInsuficienteException, Exception{
	bancoBeta.sacar(new BigDecimal(500), contaComum);	
    assertEquals(new BigDecimal(496.50),contaComum.getSaldo());
	}
	
	
		
	@Test
	public void testSacarEspecialUm() throws Exception {    
	bancoBeta.sacar(new BigDecimal(500.00), contaPremium);	
	assertEquals(new BigDecimal(496.50),contaPremium.getSaldo());
	}
	
	
	@Test(expected = SaldoInsuficienteException.class)
	public void testSacarEspecialDois() throws SaldoInsuficienteException, Exception {    
		bancoBeta.sacar(new BigDecimal(7500), contaPremium);	
	}
	
			
	@Test
	public void testTransferirValorEspecialUm() throws TransferenciaInvalidaException, SaldoInsuficienteException {
		bancoBeta.transferirValor(new BigDecimal(300), contaPremiumDois, contaPremium);		
		assertEquals(new BigDecimal(800),contaPremiumDois.getSaldo());		
		assertEquals(new BigDecimal(699),contaPremium.getSaldo());
	}
	
	@Test
	public void testTransferirValorUm() throws TransferenciaInvalidaException, SaldoInsuficienteException {
		
	    bancoBeta.transferirValor(new BigDecimal(200), contaComumDois, contaComum);		
		assertEquals(new BigDecimal(700),contaComumDois.getSaldo());		
		assertEquals(new BigDecimal(799),contaComum.getSaldo());
	}
	
	@Test
	public void testDeposito() throws OperacaoInvalidaException {		
		bancoBeta.depositar(new BigDecimal(500), contaComum);
		assertEquals(new BigDecimal(1500),contaComum.getSaldo());
	}
	
	@Test(expected = OperacaoInvalidaException.class)
	public void testQuantidadeOperacoes() throws SaldoInsuficienteException, Exception {
		bancoBeta.sacar(new BigDecimal(100), contaComum);
		bancoBeta.sacar(new BigDecimal(100), contaComum);
		bancoBeta.sacar(new BigDecimal(100), contaComum);		
	}
	
	

}