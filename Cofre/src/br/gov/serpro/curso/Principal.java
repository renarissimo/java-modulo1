package br.gov.serpro.curso;

import java.util.ArrayList;
import java.util.Arrays;

	public class Principal {
	    
	    public static void main(String[] args){
	    	
	            Cofre cofre =  new Cofre();
	            
	            cofre.adicionarMoeda(new Moeda(0.01));
	            cofre.adicionarMoeda(new Moeda(0.05));
	            cofre.adicionarMoeda(new Moeda(0.50));
	            cofre.adicionarMoeda(new Moeda(1.0));
	            cofre.adicionarMoeda(new Moeda(0.25));
	            cofre.adicionarMoeda(new Moeda(0.10));
	            cofre.adicionarMoeda(new Moeda(0.05));
	            cofre.adicionarMoeda(new Moeda(0.50));
	            cofre.adicionarMoeda(new Moeda(0.10));
	            	            	           
	            System.out.println("Quantidade de moedas inseridas no Cofre = " + cofre.quantidade());
	            System.out.println("Moedas no Cofre com o valor de 0.5 =  " + cofre.retornarQuantidadedeMoedasValor(0.05));
	            System.out.println("Moeda com o maior valor no Cofre = " + cofre.maiorValor().getValorMoeda());
	            System.out.println("Valor total de moedas no Cofre = " + cofre.retornarValorTotal());
	        }
}				