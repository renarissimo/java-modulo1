package br.gov.serpro.conta;

public class ContaCorrentePremium implements ContaCorrente{
	
	private Double saldo = 0.0; 
	private static final Double REMUNERACAO = 1.06;
	private static final Double TAXADEJUROS = 1.0;
	

	@Override
	public Double depositar(Double valor) {		
		return (saldo = saldo + valor * REMUNERACAO);
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
