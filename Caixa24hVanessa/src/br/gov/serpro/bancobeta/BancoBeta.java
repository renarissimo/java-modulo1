package br.gov.serpro.bancobeta;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDate;
import java.util.List;

import br.gov.serpro.banco.Banco;
import br.gov.serpro.banco.Conta;
import br.gov.serpro.banco.Lancamento;
import br.gov.serpro.exception.OperacaoInvalidaException;
import br.gov.serpro.exception.SaldoInsuficienteException;
import br.gov.serpro.exception.TransferenciaInvalidaException;

public class BancoBeta extends Banco{
	
	private static final BigDecimal MENOS_UM =  new BigDecimal(-1);
	private static final BigDecimal TAXA_SAQUE =  new BigDecimal(0.005);
	private static final BigDecimal CUSTO_SAQUE =  new BigDecimal(1);
	private static final BigDecimal TAXA_TRANSFERENCIA =  new BigDecimal(1);
	private static final MathContext mc = new MathContext(2); // 2 precision
	

	public BancoBeta(String nome, Long numero) {
		super(nome, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sacar(BigDecimal valor, Conta conta) throws SaldoInsuficienteException, Exception {
		conta.verificarQuantidade(conta, LocalDate.now());						
		LocalDate sysdate = LocalDate.now();		
		valor = (valor.add(valor.multiply(TAXA_SAQUE,mc)).add(CUSTO_SAQUE));		
		Lancamento transacao = new Lancamento("Saque",valor.multiply(MENOS_UM),sysdate);		
		if   ((conta.getSaldo().add(conta.getLimite())).compareTo(valor) == -1) {		
			throw new SaldoInsuficienteException();
		}else {			
			conta.registrarLancamento(transacao);
		}		
		
	}

	@Override
	public void depositar(BigDecimal valor, Conta conta) throws OperacaoInvalidaException {
		conta.verificarQuantidade(conta, LocalDate.now());						
		LocalDate sysdate = LocalDate.now();		
		Lancamento transacao = new Lancamento("Saque",valor,sysdate);
			conta.registrarLancamento(transacao);						
	}

	@Override
	public BigDecimal consultarSaldo(Conta conta) {
		try {
			conta.verificarQuantidade(conta, LocalDate.now());
		} catch (OperacaoInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		return conta.getSaldo();
	}

	@Override
	public List<Lancamento> consultaExtrato(Conta conta, LocalDate dataInicio, LocalDate dataFim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void transferirValor(BigDecimal valorATransferir, Conta contaDestino, Conta conta)
			throws TransferenciaInvalidaException,SaldoInsuficienteException {		
		LocalDate sysdate = LocalDate.now();
		Lancamento transacao = new Lancamento("Transferir",(valorATransferir.add(TAXA_TRANSFERENCIA)).multiply(MENOS_UM),sysdate);		
		Lancamento transacaoDestino = new Lancamento("Transferir",valorATransferir,sysdate);		

		if ((conta.getSaldo().add(conta.getLimite())).compareTo(valorATransferir.add(TAXA_TRANSFERENCIA)) == -1) {
			throw new SaldoInsuficienteException();
		}else {			
			conta.registrarLancamento(transacao);
			contaDestino.registrarLancamento(transacaoDestino);
		}		
									
	}

}
