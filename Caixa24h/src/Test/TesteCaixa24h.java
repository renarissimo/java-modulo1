package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import serpro.BancoAlpha;
import serpro.BancoBeta;
import serpro.Caixa24h;


public class TesteCaixa24h {
	
	private BancoAlpha a1,  a2;
	private BancoBeta b1,  b2;

	@Before
	public void before() {
			
		a1 = new BancoAlpha("1-1234",1);		
		a2 = new BancoAlpha("1-5678",1);		
		b1 = new BancoBeta("2-1234",1);		
		b2 = new BancoBeta("2-5678",1);		
					
	}
	
	@Test
    public void testRealizarDepositoBancoAlpha() {
		double saldoAtual = 0;
		saldoAtual = a1.obterSaldo();
		a1.realizarDeposito(0.00);
		assertEquals((0.00 + saldoAtual),a1.obterSaldo(),0.01);	//
		saldoAtual = a2.obterSaldo();
		a2.realizarDeposito(0.00);
		assertEquals((0.00 + saldoAtual),a2.obterSaldo(),0.01);	//		
    }		

	
	@Test
    public void testRealizarSaqueBancoAlphaUm() {
		a1.realizarSaque(0.00);		
		assertEquals(0.00,a2.obterSaldo(),0.01);
		
    }
	
	
	@Test
    public void testEmitirExtratoBancoAlpha() {
		a1.consultarExtrato();
		assertEquals(0.00,a1.obterSaldo(),0.01);	//
		a2.consultarExtrato();
		assertEquals(0.00,a2.obterSaldo(),0.01);	//
    }
		
	
	@Test
    public void testRealizarSaqueBancoAlphaDois() {		
		a1.realizarSaque(0.00);		
		assertEquals(0.00,a1.obterSaldo(),0.01);	//
    }
	
	
	@Test
	public void testRealizarTransferenciaBancoAlpha(){
		a1.realizarTransferencia(1, "1-5678", 0.00);
		assertEquals(0.00,a1.obterSaldo(),0.01);		
		assertEquals(0.00,a2.obterSaldo(),0.01);		
	}
	
	
	@Test
    public void testRealizarDepositoBancoBeta() {      
		b1.realizarDeposito(0.00);
		assertEquals(0.00,b1.obterSaldo(),0.01);	//
		b2.realizarDeposito(1000.00);
		assertEquals(0.00,b1.obterSaldo(),0.01);	//		
    }
		
    
	@Test
	public void testRealizarTransferenciaBancoBeta(){
		b1.realizarTransferencia(2, "2-5678", 500.00);
		assertEquals(0.00,b1.obterSaldo(),0.01);		
		assertEquals(0.00,b2.obterSaldo(),0.01);		
	}
	
								   
}
