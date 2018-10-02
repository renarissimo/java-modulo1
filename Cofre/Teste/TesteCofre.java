import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.gov.serpro.curso.Cofre;
import br.gov.serpro.curso.Moeda;

public class TesteCofre {

	private Cofre cofre;
			
	@Before
	public void before() {
		cofre = new Cofre();
						
		
		cofre.adicionarMoeda(new Moeda(0.01));
        cofre.adicionarMoeda(new Moeda(0.05));
        cofre.adicionarMoeda(new Moeda(0.50));
        cofre.adicionarMoeda(new Moeda(1.0));
        cofre.adicionarMoeda(new Moeda(0.25));
        cofre.adicionarMoeda(new Moeda(0.10));
        cofre.adicionarMoeda(new Moeda(0.05));
        cofre.adicionarMoeda(new Moeda(0.50));
        cofre.adicionarMoeda(new Moeda(0.10));
		
	}
	
	@Test
    public void testQuantidadeMoedas() {      
    assertEquals(9,cofre.quantidade());
    }
	
	@Test
    public void testRetornarDeterminadoValor() {      
    assertEquals(2,cofre.retornarQuantidadedeMoedasValor(0.05));
    }
	
	@Test
    public void testRetornarMaiorValor() {      
    assertEquals(1.0,cofre.maiorValor().getValorMoeda(),0.02); // precisão
    }
	
	@Test
    public void testValorTotal() {      
    assertEquals(2.56,cofre.retornarValorTotal(),0.02); // precisão
    }				    

}
