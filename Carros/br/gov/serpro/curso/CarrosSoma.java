package br.gov.serpro.curso;

public class CarrosSoma extends CarroDeCorrida{
	private double potencia;

	public CarrosSoma(String nome, double potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.potencia = potencia;
	}
	
	@Override
	public void acelerar() {
	    velocidade += potencia;
	    if(velocidade > velocidadeMaxima)
	       velocidade = velocidadeMaxima; 
	}	
	
}
