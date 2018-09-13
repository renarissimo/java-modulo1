package br.gov.serpro.curso;

import java.util.ArrayList;
import java.util.List;

public class Cofre {
	double valor;
	ArrayList<double> moedas = new ArrayList<double> ();        		

		public int quantidade() {
		    return (moedas.size()+1);
		}

		public double maiorValor() {
			for (int x = 0; x <= moedas.size(); x++) {
				double valor = 0.0;
			    if (moedas(x) > valor) {
			    	valor == moedas(x);
			    }
			}
			return (valor);
		}
		
		public int determinadoValor(double moedaValor){
			for (int x = 0; x <= moedas.size(); x++) {
				int quantidade = 0;
			    if (moedaValor == moedas(x)) {
			    	quantidade++;
			    }
			}
			return (quantidade);
		}
		
}
