package br.gov.serpro.bancoalfa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.gov.serpro.banco.Conta;
import br.gov.serpro.banco.Lancamento;
import br.gov.serpro.exception.OperacaoInvalidaException;

public class ContaComum extends Conta{

	private static final int QUANTIDADE_DE_OPERACOES =  3;

	public ContaComum(BigDecimal saldo, String idConta) {
		super(saldo, idConta);

	}

	@Override
	public BigDecimal getLimite() {

		return new BigDecimal(0.00);
	}

	@Override
	public List<Lancamento> consultaLancamento(LocalDate dataInicial, LocalDate dataFinal) {
						
		List<Lancamento> extrato = null;;
		
		for (Lancamento lancamento : lancamentos) {
		    if (lancamento.getData().isAfter(dataInicial)||(lancamento.getData().isBefore(dataFinal))) {
		        extrato.add(lancamento);
		    }			
		}		
	     return(extrato);	
		}

		
	 @Override
	 public void verificarQuantidadeOperacoes(Conta conta, LocalDate date)
	     		throws OperacaoInvalidaException{
		 int quantidadeLancamentos =0;
	 for (Lancamento lancamento : lancamentos) {
		 if (lancamento.getData().equals(date)) {		 
		     ++quantidadeLancamentos;
		     if (quantidadeLancamentos >= QUANTIDADE_DE_OPERACOES) {
		    	 throw new OperacaoInvalidaException();
		     }
		 }		
	   }	 	        	 				
	 }
	 	 
}	
