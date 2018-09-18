package br.gov.serpro.curso;

import java.util.ArrayList;

public class Cofre {			
		
	ArrayList<Moeda> moedas = new ArrayList<Moeda>();
			
		public int quantidade() {
		    return (moedas.size());
		}
			
		public Moeda maiorValor() {
			double valor = 0;
			for (int x = 0; x < moedas.size(); x++) {				
			    if (moedas.get(x).getValorMoeda() > valor) {
			    	valor = moedas.get(x).getValorMoeda();
			    }
			}
			return new Moeda(valor);
			// poderia ser return new Moeda(valor).getValorMoeda(); 
		}
		
		public void adicionarMoeda(Moeda valor) {
			moedas.add(valor);
		}						
		
		public int retornarQuantidadedeMoedasValor(double moedaValor){
			int quantidade = 0;			
			for (int x = 0; x < moedas.size(); x++) {
				
			    if (moedaValor == moedas.get(x).getValorMoeda()) {

			    	quantidade++;
			    }
			}
			return (quantidade);
		}
		
		public double retornarValorTotal() {
			double valor = 0;
			for (int x = 0; x < moedas.size(); x++) {							    
			    	valor += moedas.get(x).getValorMoeda();
			    }			
			return(valor);			 
		}
		
}