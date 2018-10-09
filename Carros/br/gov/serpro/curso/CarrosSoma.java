package br.gov.serpro.curso;

public class CarrosSoma extends CarroDeCorrida{
	private int potencia;

	public CarrosSoma(String nome, int potencia, int velocidadeMaxima) {
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
