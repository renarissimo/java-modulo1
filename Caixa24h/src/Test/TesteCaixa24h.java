package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import serpro.BancoAlpha;
import serpro.BancoBeta;
import serpro.Caixa24h;
import serpro.Transferencia;


public class TesteCaixa24h {
	
	private BancoAlpha a1;
	private BancoBeta b1;
    private Caixa24h caixaA, caixaB;
    private Transferencia transferenciaA, transferenciaB;
    
	@Before
	public void before() {
	// instanciar o caixa24h			
		a1 = new BancoAlpha("1-12345",1111);
		b1 = new BancoBeta("2-12345",2222);						
		caixaA = new Caixa24h(a1);
		caixaB = new Caixa24h(b1);
		transferenciaA = new Transferencia("1-12345",1111,"1,67890",2222,0.00);
		transferenciaB = new Transferencia("2-12345",2222,"2,67890",3333,0.00);
					
	}
	
	@Test
    public void testRealizarDepositoBancoAlpha() {
		double saldoAtual = 0;
		saldoAtual = caixaA.obterSaldo();
		caixaA.realizarDeposito(0.00);
		assertEquals((0.00 + saldoAtual),caixaA.obterSaldo(),0.01);	//
		saldoAtual = caixaA.obterSaldo();
		caixaA.realizarDeposito(0.00);
		assertEquals((0.00 + saldoAtual),caixaA.obterSaldo(),0.01);	//		
    }		

	
	@Test
    public void testRealizarSaqueBancoAlpha() {
		caixaA.realizarSaque(0.00);		
		assertEquals(0.00,caixaA.obterSaldo(),0.01);
		
    }
	
	
	
	@Test
    public void testEmitirExtratoBancoAlpha() {
		caixaA.consultarExtrato();
		assertEquals(0.00,caixaA.obterSaldo(),0.01);	//
    }
		
	
	@Test
    public void testRealizarSaqueBancoBeta() {		
		caixaB.realizarSaque(0.00);		
		assertEquals(0.00,caixaB.obterSaldo(),0.01);	//
    }
	
	
	@Test
	public void testRealizarTransferenciaBancoAlpha(){
		caixaA.realizarTransferencia(transferenciaA);
		assertEquals(0.00,caixaA.obterSaldo(),0.01);						
	}
	
	
	@Test
    public void testRealizarDepositoBancoBeta() {      
		caixaB.realizarDeposito(0.00);
		assertEquals(0.00,caixaB.obterSaldo(),0.01);	//			
    }
		
    
	@Test
	public void testRealizarTransferenciaBancoBeta(){
		caixaB.realizarTransferencia(transferenciaB);
		assertEquals(0.00,caixaB.obterSaldo(),0.01);
	}
	
								   
}
