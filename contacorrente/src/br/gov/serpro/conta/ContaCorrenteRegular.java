package br.gov.serpro.conta;

public class ContaCorrenteRegular implements ContaCorrente{

	private double saldo = 0.0;
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

	@Override
	public void efetuarRetirada(double valorRetirada) throws Exception {
		
		if (saldo >= valorRetirada) {
			
			saldo -= valorRetirada;
		}else {	
			
			throw new SaldoInsuficienteException();
		}
	}		
						
}
