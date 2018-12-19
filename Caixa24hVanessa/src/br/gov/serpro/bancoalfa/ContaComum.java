package br.gov.serpro.bancoalfa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.gov.serpro.banco.Conta;
import br.gov.serpro.banco.Lancamento;
import br.gov.serpro.exception.OperacaoInvalidaException;

public class ContaComum extends Conta{

	public ContaComum(BigDecimal saldo, String idConta) {
		super(saldo, idConta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal getLimite() {
		// TODO Auto-generated method stub
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
	 public int verificarQuantidade (Conta conta, LocalDate date)
	     		throws OperacaoInvalidaException{
		 int i =0;
	 for (Lancamento lancamento : lancamentos) {
		 if (lancamento.getData().equals(date)) {
		     i++;
		     if (i > 3) {
		    	 throw new OperacaoInvalidaException();
		     }
		 }			
	 }	 	        
	 return i;				
	 }
	 	 
}	
