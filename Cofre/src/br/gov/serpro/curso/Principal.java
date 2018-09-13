package br.gov.serpro.curso;

import java.util.ArrayList;
import java.util.Arrays;

	public class Principal {
	    
	    public static void main(String[] args){	            
	            Cofre cofre =  new Cofre();
	            
	            cofre.moedas.add(0.1);
	            cofre.moedas.add(0.10);
	            cofre.moedas.add(0.5);
	            cofre.moedas.add(0.50);
	            cofre.moedas.add(1);
	            cofre.moedas.add(0.25);
	            cofre.moedas.add(0.10);
	            cofre.moedas.add(0.5);
	            cofre.moedas.add(0.50);
	            cofre.moedas.add(0.10);	            	            
	            
	            System.out.println("Quantidade de moedas inseridas no Cofre = " + Cofre.quantidade());	            
	            System.out.println("Moedas no Cofre com o valor de = " + moedas.get(1) + " - " Cofre.determinadoValor(moedas.get(1));
	            System.out.println("Moeda com o maior valor no Cofre = " + Cofre.maiorValor());	            	            	            	            
	        }
}				