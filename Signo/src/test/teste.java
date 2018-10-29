package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import serpro.Pessoa;
import serpro.TV;


public class teste {
	
	private Pessoa Renato;	
		
	@Before
	public void before() {
		
		//Renato = new Pessoa('1983-08-12');	
		Renato = new Pessoa('1983-08-12');
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
