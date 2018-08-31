package br.gov.serpro.curso;

public class Principal {
	public static void main(String [] args) {
		Carros c1 = new Carros();
		c1.potencia = 10;
		c1.nome = "Punto";
		c1.velocidade = 0;

		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.frear();

		c1.imprimir();
		}

}
