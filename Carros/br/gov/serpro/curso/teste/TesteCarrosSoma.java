package br.gov.serpro.curso.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.gov.serpro.curso.CarroDeCorrida;
import br.gov.serpro.curso.CarrosSoma;

public class TesteCarrosSoma {
	
	private CarroDeCorrida carros;
	
	@Before
	public void incializaCarros() {
		carros = new CarrosSoma("teste",10,100);		
	}
    
    @Test
    public void testCarroParado() {
        assertEquals(0,carros.getVelocidade());
       }
    
    @Test
    public void testAcelerar() {
        carros.acelerar();
        assertEquals(10,carros.getVelocidade());
       }
    
    @Test
    public void testFrear() {
        carros.acelerar();
        carros.frear();
        assertEquals(5,carros.getVelocidade());
       }
    
    @Test
    public void testFrearAteZero() {
        carros.acelerar();
        carros.frear();
        carros.frear();
        carros.frear();
        carros.frear();
        assertEquals(0,carros.getVelocidade());
       } 
    
    @Test
    public void testAcelerarAteVelocidadeMaxima() {
       for (int i=0; i<14; i ++)
          carros.acelerar();
          assertEquals(100,carros.getVelocidade());
       }
}
