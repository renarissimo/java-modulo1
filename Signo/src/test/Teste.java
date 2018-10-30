package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import serpro.Pessoa;


public class Teste {
	
	private Pessoa renato;	
	private Pessoa teste;
	
	LocalDate renatoNasc = LocalDate.parse("1983-08-12");
	LocalDate testeNasc = LocalDate.parse("1983-04-12");
			
						
	@Before
	public void before() {		
		renato = new Pessoa(renatoNasc);		
		teste = new Pessoa(testeNasc);
	}

	@Test
	public void test() {        
		//assertEquals(35, renato.getIdade());
		assertEquals("Outros", renato.getSigno());
		
	}
	
	@Test
	public void test2() {        
		//assertEquals(35, renato.getIdade());
		assertEquals("Aries", teste.getSigno());
		
	}
}
;