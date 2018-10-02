package br.gov.serpro.curso;

public class DetalhePedido {
	//
	private int quantidade;
	private String statusImposto;
	
	public DetalhePedido(int quantidade, String statusImposto) {
		this.quantidade = quantidade;
		this.statusImposto = statusImposto;
	}
	
	public double calSubTotal() {
		return 10.5;
	}
	
	public double calcPeso() {
		return 40.0;
	}
		
}
