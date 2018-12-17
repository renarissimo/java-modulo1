package br.gov.serpro.bancoalfa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.gov.serpro.banco.Conta;
import br.gov.serpro.banco.Lancamento;

public class ContaComum extends Conta{

	public ContaComum(BigDecimal saldo, String idConta) {
		super(saldo, idConta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal getLimite() {		
		return new BigDecimal(0.00);
	}

	@Override
	protected List<Lancamento> consultaLancamento(LocalDate dataInicial, LocalDate dataFinal) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override // Criado por Renato
	public void registrarLancamento(Lancamento lancamento) {
       
    }
}	
