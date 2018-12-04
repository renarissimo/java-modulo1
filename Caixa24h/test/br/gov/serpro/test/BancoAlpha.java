package br.gov.serpro.test;


import java.math.BigDecimal;
import java.util.List;

import br.gov.serpro.principal.Banco;
import br.gov.serpro.principal.ContaCorrente;
import br.gov.serpro.principal.DadosTransferencia;

public class BancoAlpha implements Banco {
		
	public BancoAlpha(ContaCorrente operacaoAlpha) {
		// TODO Auto-generated constructor stub
	}
	@Override	
	public List consultarExtrato(ContaCorrente operacao) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Double obterSaldo(ContaCorrente operacao) {
		// TODO Auto-generated method stub
		return 0.0;
	}
	@Override
	public void realizarTransferencia(DadosTransferencia transferencia){
		// TODO Auto-generated method stub
		
	}
	@Override
	public void realizarDeposito(ContaCorrente operacao, BigDecimal valorDeposito) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void realizarSaque(ContaCorrente operacao, BigDecimal valorSaque){
		// TODO Auto-generated method stub
		
	}
	
}
