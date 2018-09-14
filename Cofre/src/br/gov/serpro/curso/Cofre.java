package br.gov.serpro.curso;

import java.util.ArrayList;

public class Cofre {			
		
	ArrayList<Moeda> moedas = new ArrayList<Moeda>();
			
		public int quantidade() {
		    return (moedas.size());
		}

		public Moeda maiorValor() {
			Moeda valor = 0;
			for (int x = 0; x <= moedas.size(); x++) {				
			    if (moedas.get(x) > valor) {
			    	valor == moedas.get(x);
			    }
			}
			return (valor);
		}
		
		public int determinadoValor(double moedaValor){
			int quantidade = 0;			
			for (int x = 0; x <= moedas.size(); x++) {				
			    if (moedaValor == moedas.getMoeda(x)) {
			    	quantidade++;
			    }
			}
			return (quantidade);
		}
		
}
