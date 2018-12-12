package br.gov.serpro.caixa24h;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.gov.serpro.banco.Conta;
import br.gov.serpro.banco.Lancamento;

public class ContaMock extends Conta {

    public ContaMock(BigDecimal saldo, String idConta) {
        super(saldo, idConta);

    }

    @Override
    public BigDecimal getSaldo() {
        return super.getSaldo();
    }

    @Override
    public BigDecimal getLimite() {
        return null;
    }

    @Override
    public String getIdConta() {
        return null;
    }

    public void registrarLancamento(Lancamento lancamento) {
        super.registrarLancamento(lancamento);
    }

    @Override
    protected List<Lancamento> consultaLancamento(LocalDate dataInicial,
            LocalDate dataFinal) {
        return null;
    }

}
