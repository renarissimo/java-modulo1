package br.gov.serpro.curso;

public class Pagamento {
	//
	private int quantidade;
	
	public Pagamento(int quantidade) {
		this.setQuantidade(quantidade);
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
