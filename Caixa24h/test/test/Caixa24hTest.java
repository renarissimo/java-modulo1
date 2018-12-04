package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import caixa24h.Caixa24h;
import serpro.ContaCorrente;
import serpro.DadosTransferencia;


public class Caixa24hTest {
	
	private BancoAlpha alpha;	
    private Caixa24h caixaAlpha;
    private DadosTransferencia transferenciaAlpha;
    private ContaCorrente contaCorrente, contaCorrenteDestino;
    
	@Before
	public void before() {
	// instanciar o caixa24h
		contaCorrente = new ContaCorrente("1-12345",1111);
		contaCorrenteDestino = new ContaCorrente("2-34567",2222);
		alpha = new BancoAlpha(contaCorrente);						
		caixaAlpha = new Caixa24h(alpha);
		transferenciaAlpha = new DadosTransferencia(contaCorrente,contaCorrenteDestino ,0.00);
					
	}
	
	@Test
    public void testRealizarDepositoBancoAlpha() {
		double saldoAtual = 0;
		saldoAtual = caixaAlpha.obterSaldo(contaCorrente);
	    caixaAlpha.realizarDeposito(contaCorrente,null);
		assertEquals((0.00 + saldoAtual),caixaAlpha.obterSaldo(contaCorrente),0.01);	//				
    }		

	
	@Test
    public void testRealizarSaqueBancoAlpha() {
		caixaAlpha.realizarSaque(contaCorrente,null);		
		assertEquals(0.00,caixaAlpha.obterSaldo(contaCorrente),0.01);
		
    }
		
	
	@Test
    public void testEmitirExtratoBancoAlpha() {
		caixaAlpha.consultarExtrato(contaCorrente);
		assertEquals(0.00,caixaAlpha.obterSaldo(contaCorrente),0.01);	//
    }
			
	
	@Test
	public void testRealizarTransferenciaBancoAlpha(){
		caixaAlpha.realizarTransferencia(transferenciaAlpha);
		assertEquals(0.00,caixaAlpha.obterSaldo(contaCorrente),0.01);						
	}		
								   
}
