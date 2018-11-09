package br.gov.serpro.conta;

public interface ContaCorrente {
	
	Double depositar(Double valor);
	Double obterSaldo();
	Double calcularTaxaJuros();
	void efetuarRetirada(double valorRetirada) throws Exception;
}
