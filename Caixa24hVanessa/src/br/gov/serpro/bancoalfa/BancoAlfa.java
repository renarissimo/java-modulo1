package br.gov.serpro.bancoalfa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import br.gov.serpro.banco.Banco;
import br.gov.serpro.banco.Conta;
import br.gov.serpro.banco.Lancamento;
import br.gov.serpro.exception.OperacaoInvalidaException;
import br.gov.serpro.exception.SaldoInsuficienteException;
import br.gov.serpro.exception.TransferenciaInvalidaException;

public class BancoAlfa extends Banco{
		 	  

	public BancoAlfa(String nome, Long numero) {
		super(nome, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sacar(BigDecimal valor, Conta conta) throws SaldoInsuficienteException {
		try {
			conta.verificarQuantidade(conta, LocalDate.now());
		} catch (OperacaoInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BigDecimal saldoAtual = conta.getSaldo();		
		BigDecimal saldoPosterior = saldoAtual.subtract(valor).ZERO;
		LocalDate sysdate = LocalDate.now();		
		Lancamento transacao = new Lancamento("Saque",saldoPosterior,sysdate);		
		if (saldoPosterior.subtract(valor).compareTo(conta.getLimite()) == -1) {
			throw new SaldoInsuficienteException();
		}else {			
			conta.registrarLancamento(transacao);
		}	
									
	}

	@Override
	public void depositar(BigDecimal valor, Conta conta) throws OperacaoInvalidaException{
		throw new OperacaoInvalidaException();
		
	}

	@Override
	public BigDecimal consultarSaldo(Conta conta) {
		try {
			conta.verificarQuantidade(conta, LocalDate.now());
		} catch (OperacaoInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		LocalDate sysdate = LocalDate.now();
		Lancamento transacao = new Lancamento("Consultar Saldo",conta.getSaldo(),sysdate);
		return conta.getSaldo();
	}

	@Override
	public List<Lancamento> consultaExtrato(Conta conta, LocalDate dataInicio, LocalDate dataFim) {
		try {
			conta.verificarQuantidade(conta, LocalDate.now());
		} catch (OperacaoInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		LocalDate sysdate = LocalDate.now();
		Lancamento transacao = new Lancamento("Consultar Extrato",conta.getSaldo(),sysdate); 
		return conta.consultaLancamento(dataInicio, dataFim);
		
	}

	// Verificar a necessidade da exce��o TransferenciaInvalidaException
	@Override
	public void transferirValor(BigDecimal valorATransferir, Conta contaDestino, Conta conta)
			throws TransferenciaInvalidaException,SaldoInsuficienteException {
		BigDecimal saldoAtual = conta.getSaldo();		
		BigDecimal saldoPosterior = saldoAtual.subtract(valorATransferir).ZERO;
		BigDecimal saldoPosteriorDestino = saldoAtual.add(valorATransferir).ZERO;
		LocalDate sysdate = LocalDate.now();
		Lancamento transacao = new Lancamento("Transferir",saldoPosterior,sysdate);		
		Lancamento transacaoDestino = new Lancamento("Transferir",saldoPosteriorDestino,sysdate);
		if (saldoPosterior.subtract(valorATransferir).compareTo(conta.getLimite()) == -1) {
			throw new SaldoInsuficienteException();
		}else {			
			conta.registrarLancamento(transacao);
			contaDestino.registrarLancamento(transacaoDestino);
		}	
									
	}
			
}	

