package serpro;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class ListaJogadores {

	private List<Jogadores> listaJogadores;
	      
	 public ListaJogadores() {
	        listaJogadores = new ArrayList<>();
	    }
	    
	    public void adiciona(Jogadores jogador) {
	        listaJogadores.add(jogador);
	    }

	    public void ordenaPorQtdeGol() {
	        Collections.sort (this.listaJogadores, Collections.reverseOrder());
	    }
	    
	    public void mostraClassificacao() {
	        int ordenacao = 0;
	        for(Jogadores jogador : listaJogadores){
	            ordenacao++;
	            System.out.println(ordenacao+": "+jogador.getNome()+" Gols: "+jogador.getGol());
	        }
	    }

	
}
