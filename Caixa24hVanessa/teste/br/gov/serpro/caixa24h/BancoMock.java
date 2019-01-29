package br.gov.serpro.caixa24h;

import br.gov.serpro.banco.Banco;
import br.gov.serpro.banco.Conta;
import br.gov.serpro.banco.Lancamento;
import br.gov.serpro.exception.SaldoInsuficienteException;
import br.gov.serpro.exception.TransferenciaInvalidaException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class BancoMock extends Banco {
    Date data = new Date(System.currentTimeMillis());

    public BancoMock(String nome, Long numero) {
        super(nome, numero);
    }

    @Override
    public void sacar(BigDecimal valor, Conta conta)
            throws SaldoInsuficienteException {
    }

    @Override
    public void depositar(BigDecimal valor, Conta conta) {

    }

    @Override
    public BigDecimal consultarSaldo(Conta conta) {
        return null;
    }

    @Override
    public List<Lancamento> consultaExtrato(Conta conta, LocalDate dataInicial,
            LocalDate dataFinal) {
        List<Lancamento> lancamento = null;
        return lancamento;
    }

    @Override
    public void transferirValor(BigDecimal valorATransferir,
            Conta contaDestino, Conta conta)
            throws TransferenciaInvalidaException {

    }

}
