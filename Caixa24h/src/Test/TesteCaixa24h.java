package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import serpro.BancoAlpha;
import serpro.BancoBeta;
import serpro.Caixa24h;
import serpro.Operacao;
import serpro.Transferencia;


public class TesteCaixa24h {
	
	private BancoAlpha a1;
	private BancoBeta b1;
    private Caixa24h caixaA, caixaB;
    private Transferencia transferenciaA, transferenciaB;
    private Operacao operacaoA, operacaoB;
    
	@Before
	public void before() {
	// instanciar o caixa24h
		operacaoA = new Operacao("1-12345",1111);
		operacaoB = new Operacao("2-12345",2222);
		a1 = new BancoAlpha(operacaoA);
		b1 = new BancoBeta(operacaoB);						
		caixaA = new Caixa24h(a1);
		caixaB = new Caixa24h(b1);
		transferenciaA = new Transferencia("1-12345",1111,"1,67890",2222,0.00);
		transferenciaB = new Transferencia("2-12345",2222,"2,67890",3333,0.00);
					
	}
	
	@Test
    public void testRealizarDepositoBancoAlpha() {
		double saldoAtual = 0;
		saldoAtual = caixaA.obterSaldo(operacaoA);
		caixaA.realizarDeposito(operacaoA,0.00);
		assertEquals((0.00 + saldoAtual),caixaA.obterSaldo(operacaoA),0.01);	//
		saldoAtual = caixaA.obterSaldo(operacaoA);
		caixaA.realizarDeposito(operacaoA,0.00);
		assertEquals((0.00 + saldoAtual),caixaA.obterSaldo(operacaoA),0.01);	//		
    }		

	
	@Test
    public void testRealizarSaqueBancoAlpha() {
		caixaA.realizarSaque(operacaoA,0.00);		
		assertEquals(0.00,caixaA.obterSaldo(operacaoA),0.01);
		
    }
	
	
	
	@Test
    public void testEmitirExtratoBancoAlpha() {
		caixaA.consultarExtrato(operacaoA);
		assertEquals(0.00,caixaA.obterSaldo(operacaoA),0.01);	//
    }
		
	
	@Test
    public void testRealizarSaqueBancoBeta() {		
		caixaB.realizarSaque(operacaoA,0.00);		
		assertEquals(0.00,caixaB.obterSaldo(operacaoA),0.01);	//
    }
	
	
	@Test
	public void testRealizarTransferenciaBancoAlpha(){
		caixaA.realizarTransferencia(transferenciaA);
		assertEquals(0.00,caixaA.obterSaldo(operacaoA),0.01);						
	}
	
	
	@Test
    public void testRealizarDepositoBancoBeta() {      
		caixaB.realizarDeposito(operacaoB,0.00);
		assertEquals(0.00,caixaB.obterSaldo(operacaoB),0.01);	//			
    }
		
    
	@Test
	public void testRealizarTransferenciaBancoBeta(){
		caixaB.realizarTransferencia(transferenciaB);
		assertEquals(0.00,caixaB.obterSaldo(operacaoB),0.01);
	}
	
								   
}
