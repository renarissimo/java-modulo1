package br.gov.serpro.BancoAlfa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.gov.serpro.banco.Banco;
import br.gov.serpro.banco.Conta;
import br.gov.serpro.banco.Lancamento;
import br.gov.serpro.exception.SaldoInsuficienteException;
import br.gov.serpro.exception.TransferenciaInvalidaException;

public class BancoAlfa extends Banco{

	public BancoAlfa(String nome, Long numero) {
		super(nome, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sacar(BigDecimal valor, Conta conta) throws SaldoInsuficienteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(BigDecimal valor, Conta conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal consultarSaldo(Conta conta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lancamento> consultaExtrato(Conta conta, LocalDate dataInicio, LocalDate dataFim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void transferirValor(BigDecimal valorATransferir, Conta contaDestino, Conta conta)
			throws TransferenciaInvalidaException {
		// TODO Auto-generated method stub
		
	}
}	

