package br.gov.serpro.bancobeta;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.gov.serpro.banco.Conta;
import br.gov.serpro.banco.Lancamento;
import br.gov.serpro.exception.OperacaoInvalidaException;

public class ContaPremium extends Conta{

	public ContaPremium(BigDecimal saldo, String idConta) {
		super(saldo, idConta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal getLimite() {
		// TODO Auto-generated method stub
		return new BigDecimal(5000.00);
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
	 public void verificarQuantidade (Conta conta, LocalDate date)
	     		throws OperacaoInvalidaException{
					//return 0;
	 }

}
