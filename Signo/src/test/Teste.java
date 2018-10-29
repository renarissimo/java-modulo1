package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import serpro.Pessoa;


public class Teste {
	
	private Pessoa renato;	
	
	LocalDate renatoNasc = LocalDate.parse("1983-08-12");
			
						
	@Before
	public void before() {		
		renato = new Pessoa(renatoNasc);		
	}

	@Test
	public void test() {        
		assertEquals(35, renato.getIdade());		
	}
}
