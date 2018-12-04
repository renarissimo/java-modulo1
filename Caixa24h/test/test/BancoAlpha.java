package test;


import java.math.BigDecimal;
import java.util.List;

import serpro.Banco;
import serpro.ContaCorrente;
import serpro.DadosTransferencia;

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
