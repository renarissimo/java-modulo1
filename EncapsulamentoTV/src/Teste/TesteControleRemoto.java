package Teste;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import serpro.ControleRemoto;
import serpro.TV;

public class TesteControleRemoto {

	private ControleRemoto cr1;
	private TV tv1;
	
	/*
	 public boolean mudarCanal(int canal) {	
		return tv1.verificarCanalAtivo(canal); 				
	}
 
	 * */
	
	@Before
	public void before() {
		tv1 = new TV(Arrays.asList(2,4,5,7,9,11,13));
		cr1 = new ControleRemoto(tv1);		
	}
	
	@Test
	public void ligarTV() {		
		boolean status = cr1.ligarTV();
		cr1.aumentarVolume();
		assertEquals(2, tv1.getcanalAtivo());
		assertEquals(20,tv1.getVolumeAtual());
		assertEquals(true,status);		
	}
	
	@Test
	public void desligarTV() {
		boolean status = cr1.desligarTV();
		assertEquals(false,status);
	}
	
	@Test
	public void mudarCanal() {		
		assertEquals(true,cr1.mudarCanal(5));
	}

}