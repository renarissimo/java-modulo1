package serpro;

public class Principal {

	
	    public static void main(String[] args) {
	        Jogadores a = new Jogadores("A", 10);
	        Jogadores b = new Jogadores("B", 7);
	        Jogadores c = new Jogadores("C", 15);
	        	        
	        ListaJogadores jogadores = new ListaJogadores();
	        
	        jogadores.adiciona(a);
	        jogadores.adiciona(b);
	        jogadores.adiciona(c);
	        
	        
	        System.out.println("-- CHAMPIONS LEAGUE 2017/2018 -----------------");
	        jogadores.ordenaPorQtdeGol();
	        
	        System.out.println("-------- ARTILHEIROS ---------");
	        jogadores.mostraClassificacao();
	    }

	}
