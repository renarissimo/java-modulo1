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
	private BancoAlfa bancoAlfaDois;
	private ContaComum contaComum;
	private ContaComum contaComumDois;
	private ContaEspecial contaEspecial;
	private ContaEspecial contaEspecialDois;
	
	@Before
	public void before() {
		bancoAlfa = new BancoAlfa("Renato",1L);
		bancoAlfaDois = new BancoAlfa("Sabrina",2L);
		contaComum = new ContaComum (new BigDecimal(1000),"Comum 1");						       
		contaComumDois = new ContaComum (new BigDecimal(500),"Comum 2");
		contaEspecial = new ContaEspecial (new BigDecimal(1000),"Especial 1");						       
		contaEspecialDois = new ContaEspecial (new BigDecimal(500),"Especial 2");
	}
	

	@Test
	public void testSacarComSucesso() throws OperacaoInvalidaException, SaldoInsuficienteException {
		bancoAlfa.sacar(new BigDecimal(500), contaComum);

    assertEquals(new BigDecimal(500),contaComum.getSaldo());
	}
	
	

	@Test(expected = SaldoInsuficienteException.class)
	public void testSacarEspecialComSaldoInsuficiente() throws Exception{
		bancoAlfaDois.sacar(new BigDecimal(3500), contaEspecial);
	}



	@Test
	public void testTransferirValorEspecialComSucesso() throws SaldoInsuficienteException, OperacaoInvalidaException {

		bancoAlfa.transferirValor(new BigDecimal(300), contaEspecialDois, contaEspecial);

		assertEquals(new BigDecimal(800),contaEspecialDois.getSaldo());		
		assertEquals(new BigDecimal(700),contaEspecial.getSaldo());
	}



	@Test(expected = OperacaoInvalidaException.class)
	public void testDepositoComErro() throws OperacaoInvalidaException {
			bancoAlfa.depositar(new BigDecimal(500), contaComum);
	}


	@Test(expected = OperacaoInvalidaException.class)
	public void testQuantidadeOperacoesUltrapassado() throws OperacaoInvalidaException, SaldoInsuficienteException {
			bancoAlfa.sacar(new BigDecimal(100), contaComum);
			bancoAlfa.sacar(new BigDecimal(100), contaComum);
			bancoAlfa.sacar(new BigDecimal(100), contaComum);
			bancoAlfa.sacar(new BigDecimal(100), contaComum);
	}
}