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
	
	private static final BigDecimal MENOS_UM =  new BigDecimal(-1); 
		 	  

	public BancoAlfa(String nome, Long numero) {
		super(nome, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sacar(BigDecimal valor, Conta conta) throws SaldoInsuficienteException, OperacaoInvalidaException {		
		conta.verificarQuantidade(conta, LocalDate.now());
		
				
		LocalDate sysdate = LocalDate.now();		
		Lancamento transacao = new Lancamento("Saque",valor.multiply(MENOS_UM),sysdate);		
		System.out.println("Get Saldo = " + conta.getSaldo());
		System.out.println("Limite = " + conta.getLimite());		
		//if (conta.getSaldo().compareTo(conta.getLimite()) == -1) {
		if ((conta.getSaldo().subtract(valor)).compareTo(conta.getLimite()) == -1) {
			throw new SaldoInsuficienteException();
		}else {			
			conta.registrarLancamento(transacao);
		}
		System.out.println("Get SaldoII = " + conta.getSaldo());
									
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
		System.out.println("Consta destino saldo = " + contaDestino.getSaldo());
		LocalDate sysdate = LocalDate.now();
		Lancamento transacao = new Lancamento("Transferir",valorATransferir.multiply(MENOS_UM),sysdate);		
		Lancamento transacaoDestino = new Lancamento("Transferir",valorATransferir,sysdate);
		System.out.println("Consta destino saldoII = " + contaDestino.getSaldo());
		//if (conta.getSaldo().subtract(valorATransferir).compareTo(conta.getLimite()) == -1) {
		if ((conta.getSaldo().subtract(valorATransferir)).compareTo(conta.getLimite()) == -1) {
			throw new SaldoInsuficienteException();
		}else {			
			conta.registrarLancamento(transacao);
			contaDestino.registrarLancamento(transacaoDestino);
		}		
									
	}
			
}	

