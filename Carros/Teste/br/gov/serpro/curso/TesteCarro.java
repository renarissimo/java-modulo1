package br.gov.serpro.curso;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TesteCarro {
	
	@Test
    public void testCarroParado() {
        Carros c = new Carros();       
        assertEquals(0,c.getVelocidade());
       }
	
    @Test
    public void testAcelerar() {
        Carros c = new Carros();
        c.potencia = 10;
        c.acelerar();
        assertEquals(10,c.getVelocidade());
       }
    
    @Test
    public void testFrear() {
        Carros c = new Carros();
        c.potencia = 10;
        c.acelerar();
        c.frear();
        assertEquals(5,c.getVelocidade());
       }
    
    @Test
    public void testFrearAteZero() {
        Carros c = new Carros();
        c.potencia = 10;
        c.acelerar();
        c.frear();
        c.frear();
        c.frear();
        c.frear();
        assertEquals(0,c.getVelocidade());
       } 
    /// teste
}
