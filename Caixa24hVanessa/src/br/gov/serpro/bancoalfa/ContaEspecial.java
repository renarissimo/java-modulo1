package br.gov.serpro.bancoalfa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.gov.serpro.banco.Conta;
import br.gov.serpro.banco.Lancamento;

public class ContaEspecial extends Conta{

	public ContaEspecial(BigDecimal saldo, String idConta) {
		super(saldo, idConta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal getLimite() {		
		return new BigDecimal(1000.00);
	}

	@Override
	protected List<Lancamento> consultaLancamento(LocalDate dataInicial, LocalDate dataFinal) {
		// TODO Auto-generated method stub
		return null;
	}

}
