package br.gov.serpro.bancoalfa;

import java.math.BigDecimal;
import java.time.LocalDate;
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
	}

	@Override
	public void sacar(BigDecimal valor, Conta conta) throws SaldoInsuficienteException, OperacaoInvalidaException {		
		conta.verificarQuantidadeOperacoes(conta, LocalDate.now());
		LocalDate sysdate = LocalDate.now();		
		Lancamento transacao = new Lancamento("Saque",valor.multiply(MENOS_UM),sysdate);
		if (conta.aceitarSaque(conta.getSaldo(), conta.getLimite(), valor) == false) {
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
	public BigDecimal consultarSaldo(Conta conta) throws OperacaoInvalidaException {
		conta.verificarQuantidadeOperacoes(conta, LocalDate.now());
		return conta.getSaldo();
	}

	@Override
	public List<Lancamento> consultaExtrato(Conta conta, LocalDate dataInicio, LocalDate dataFim) throws OperacaoInvalidaException{
		conta.verificarQuantidadeOperacoes(conta, LocalDate.now());
		return conta.consultaLancamento(dataInicio, dataFim);
		
	}

	// Verificar a necessidade da exce��o TransferenciaInvalidaException
	@Override
	public void transferirValor(BigDecimal valorATransferir, Conta contaDestino, Conta conta)
			throws SaldoInsuficienteException, OperacaoInvalidaException {
		conta.verificarQuantidadeOperacoes(conta, LocalDate.now());
		LocalDate sysdate = LocalDate.now();
		Lancamento transacao = new Lancamento("Transferir",valorATransferir.multiply(MENOS_UM),sysdate);		
		Lancamento transacaoDestino = new Lancamento("Transferir",valorATransferir,sysdate);		

		if (conta.saldoSuficienteParaTransferirValor(conta.getSaldo(),conta.getLimite(),valorATransferir) == false) {
			throw new SaldoInsuficienteException();
		}else {			
			conta.registrarLancamento(transacao);
			contaDestino.registrarLancamento(transacaoDestino);
		}		
									
	}
			
}	

