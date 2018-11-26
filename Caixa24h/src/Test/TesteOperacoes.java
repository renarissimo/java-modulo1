package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import serpro.BancoAlpha;
import serpro.SaldoInsuficiente;


public class TesteOperacoes {
	
	private BancoAlpha A1;

	@Before
	public void before() {
		
		//cofre = new Cofre();
		A1 = new BancoAlpha();		
					
	}
	
	@Test
    public void testRealizarDepositoUm() {      
		A1.realizarDeposito(1000.00);
		assertEquals(1000.00,A1.obterSaldo(),0.01);	//		
    }
	
	public void testRealizarDepositoDois() {      
		A1.realizarDeposito(1000.00);
		assertEquals(2000.00,A1.obterSaldo(),0.01);	//		
    }
		
	@Test
    public void testRealizarSaque() {
		try {
			A1.realizarSaque(500.00);
		} catch (SaldoInsuficiente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(1500.00,A1.obterSaldo(),0.01);	//
    }
	
	@Test
    public void testRealizarSaqueDois() {
		try {
			A1.realizarSaque(3500.00);
		} catch (SaldoInsuficiente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(1500.00,A1.obterSaldo(),0.01);	//
    }
	
	@Test
    public void testEmitirExtrato() {
		A1.consultarExtrato();
		assertEquals(1500.00,A1.obterSaldo(),0.01);	//
    }
	
	@Test
    public void testRealizarSaqueTres() {
		try {
			A1.realizarSaque(1500.00);
		} catch (SaldoInsuficiente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(0.00,A1.obterSaldo(),0.01);	//
    }
	
				    

}
