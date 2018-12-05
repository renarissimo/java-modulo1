package br.gov.serpro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.gov.serpro.caixa24h.Caixa24h;
import br.gov.serpro.principal.Banco;



public class Caixa24hTest {
	
	
	@Test
	public void deveChamarConsultarExtrato() {
		Banco banco = new BancoMock();
		Caixa24h caixa24h = new Caixa24h(banco);
		//Não realiza operação. Apenas testa a chamada
		assertNull(caixa24h.consultarExtrato(null));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void naoDevePermitirConstruirCaixaSemBanco() {
		new Caixa24h(null);
	}

}
