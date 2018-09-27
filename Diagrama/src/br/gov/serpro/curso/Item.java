package br.gov.serpro.curso;

public class Item {
	
	private double pesoEntrega;
    private String descricao;

	public Item(double pesoEntrega, String descricao) {
		this.pesoEntrega = pesoEntrega;
		this.descricao = descricao;
	}
	
	public double getPrecoPelaQuantidade() {
		return 1.0;
	}
	
	public double getPeso() {
		return 1.0;
	}

}
