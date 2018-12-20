package br.gov.serpro.caixa24h;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.gov.serpro.banco.Conta;
import br.gov.serpro.banco.Lancamento;
import br.gov.serpro.exception.OperacaoInvalidaException;

public class ContaMock extends Conta {

    public ContaMock(BigDecimal saldo, String idConta) {
        super(saldo, idConta);

    }

	@Override
	public BigDecimal getLimite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lancamento> consultaLancamento(LocalDate dataInicial, LocalDate dataFinal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void verificarQuantidade(Conta conta, LocalDate date) throws OperacaoInvalidaException {
		// TODO Auto-generated method stub
		
	}

   

}
