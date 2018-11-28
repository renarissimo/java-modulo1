package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import serpro.BancoAlpha;
import serpro.BancoBeta;
import serpro.BancoDiferenteException;
import serpro.Caixa24h;
import serpro.SaldoInsuficienteException;


public class TesteCaixa24h {
	
	private BancoAlpha a1,  a2;
	private BancoBeta b1,  b2;

	@Before
	public void before() {
			
		a1 = new BancoAlpha(1, "1-1234");		
		a2 = new BancoAlpha(1, "1-5678");		
		b1 = new BancoBeta(2, "2-1234");		
		b2 = new BancoBeta(2, "2-5678");		
					
	}
	
	@Test
    public void testRealizarDepositoBancoAlpha() {
		double saldoAtual = 0;
		saldoAtual = a1.obterSaldo();
		a1.realizarDeposito(1000.00);
		assertEquals((1000.00 + saldoAtual),a1.obterSaldo(),0.01);	//
		saldoAtual = a2.obterSaldo();
		a2.realizarDeposito(1500.00);
		assertEquals((1500.00 + saldoAtual),a2.obterSaldo(),0.01);	//		
    }		

	/*
	@Test
    public void testRealizarSaqueBancoAlphaUm() {
		a1.realizarDeposito(1000.00);
		try {
			a1.realizarSaque(500.00);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(500.00,a1.obterSaldo(),0.01);	//		
		try {
			a2.realizarSaque(3500.00);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(1500.00,a2.obterSaldo(),0.01);	//
		
    }
			

	@Test
    public void testEmitirExtratoBancoAlpha() {
		a1.consultarExtrato();
		assertEquals(500.00,a1.obterSaldo(),0.01);	//
		a2.consultarExtrato();
		assertEquals(1000.00,a2.obterSaldo(),0.01);	//
    }
		
	
	@Test
    public void testRealizarSaqueBancoAlphaDois() {
		try {
			a1.realizarSaque(1500.00);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(0.00,a1.obterSaldo(),0.01);	//
    }
	
	@Test
	public void testRealizarTransferenciaBancoAlpha() throws BancoDiferenteException {
		a1.realizarTransferencia(1, "1-5678", 500.00);
		assertEquals(0.00,a1.obterSaldo(),0.01);		
		assertEquals(1500.00,a2.obterSaldo(),0.01);		
	}
	
	@Test
    public void testRealizarDepositoBancoBeta() {      
		b1.realizarDeposito(1000.00);
		assertEquals(1000.00,b1.obterSaldo(),0.01);	//
		b2.realizarDeposito(1000.00);
		assertEquals(1000.00,b1.obterSaldo(),0.01);	//		
    }
		

	@Test
	public void testRealizarTransferenciaBancoBeta() throws BancoDiferenteException {
		b1.realizarTransferencia(2, "2-5678", 500.00);
		assertEquals(500.00,b1.obterSaldo(),0.01);		
		assertEquals(1500.00,b2.obterSaldo(),0.01);		
	}
	
	@Test
	public void testRealizarTransferenciaEntreBancos() throws BancoDiferenteException {
		b2.realizarTransferencia(1, "1-1234", 500.00);
		assertEquals(1000.00,b1.obterSaldo(),0.01);		
		assertEquals(500.00,a1.obterSaldo(),0.01);		
	}
	*/
					    
}
