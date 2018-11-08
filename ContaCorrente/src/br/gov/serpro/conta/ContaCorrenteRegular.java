package br.gov.serpro.conta;

public class ContaCorrenteRegular implements ContaCorrente{

	private Double saldo = 0.0;
	private static final Double TAXADEJUROS = 5.0;


	@Override
	public Double depositar(Double valor) {		
		return (saldo = saldo + valor);
	}

	@Override
	public Double obterSaldo() {		
		return saldo;
	}

	@Override
	public Double calcularTaxaJuros() {
		return TAXADEJUROS;
	}

}
