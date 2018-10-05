package br.gov.serpro.curso;

public class Dinheiro extends Pagamento{
	//
	private double dinheiroOferecido;
	
	public Dinheiro(double dinheiroOferecido, int quantidade) {
		super(quantidade);
		this.dinheiroOferecido = dinheiroOferecido;
	}
		

}
