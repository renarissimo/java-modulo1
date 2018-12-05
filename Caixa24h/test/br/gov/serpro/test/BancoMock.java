package br.gov.serpro.test;


import java.math.BigDecimal;
import java.util.List;

import br.gov.serpro.principal.Banco;
import br.gov.serpro.principal.ContaCorrente;
import br.gov.serpro.principal.Operacao;
import br.gov.serpro.principal.Transferencia;

public class BancoMock implements Banco {
			
	@Override	
	public List<Operacao> consultarExtrato(ContaCorrente operacao) {	
		return null;
	}
	@Override
	public Double obterSaldo(ContaCorrente operacao) {
		return 0.0;
	}
	@Override
	public void realizarTransferencia(Transferencia transferencia){
		
	}
	@Override
	public void realizarDeposito(ContaCorrente operacao, BigDecimal valorDeposito) {
		
	}
	@Override
	public void realizarSaque(ContaCorrente operacao, BigDecimal valorSaque){
		
	}
	
}
