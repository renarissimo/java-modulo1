package br.gov.serpro.curso;

import java.util.ArrayList;

public class Cofre {			
		
	ArrayList<Moeda> moedas = new ArrayList<Moeda>();
			
		public int quantidade() {
		    return (moedas.size());
		}
	
		public double maiorValor() {
			Double valor = 0.0 ;
			for (int x = 0; x <= moedas.size(); x++) {
				if ((moedas.get(x) > valor) {
			    	valor = moedas.get(x);
			    }
			}
			return (valor);
	
		
		public int determinadoValor(double moedaValor){
			int quantidade = 0;			
			for (int x = 0; x <= moedas.size(); x++) {				
			    if (moedaValor.equals(moedas.get(x))) {
			    	quantidade++;
			    }
			}
			return (quantidade);
	
		
}