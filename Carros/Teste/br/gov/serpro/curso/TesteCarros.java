package br.gov.serpro.curso;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TesteCarros {
	
	private Carros carros;
	
	@Before
	public void before() {
		carros = new Carros();
		carros.potencia = 10;
	}
    
    @Test
    public void testCarroParado() {
//        Carros c = new Carros();       
        assertEquals(0,carros.getVelocidade());
       }
    
    @Test
    public void testAcelerar() {
        /*Carros c = new Carros();
        c.potencia = 10;*/
        carros.acelerar();
        assertEquals(10,carros.getVelocidade());
       }
    
    @Test
    public void testFrear() {
        //Carros c = new Carros();
        //carros.potencia = 10;
        carros.acelerar();
        carros.frear();
        assertEquals(5,carros.getVelocidade());
       }
    
    @Test
    public void testFrearAteZero() {
        //Carros c = new Carros();
        //carros.potencia = 10;
        carros.acelerar();
        carros.frear();
        carros.frear();
        carros.frear();
        carros.frear();
        assertEquals(0,carros.getVelocidade());
       } 
    /// teste
}
