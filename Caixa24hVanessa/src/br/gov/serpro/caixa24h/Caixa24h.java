package br.gov.serpro.caixa24h;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.gov.serpro.banco.Banco;
import br.gov.serpro.banco.Conta;
import br.gov.serpro.banco.Lancamento;
import br.gov.serpro.exception.OperacaoInvalidaException;
import br.gov.serpro.exception.SaldoInsuficienteException;
import br.gov.serpro.exception.TransferenciaInvalidaException;

public class Caixa24h {

    private Conta conta;
    private Banco banco;

    public Caixa24h(Conta conta, Banco banco) {
        if (conta == null || banco == null) {
            throw new IllegalArgumentException("Banco ou conta invalidos");
        }
        this.conta = conta;
        this.banco = banco;

    }

    public void sacar(BigDecimal valor, Conta conta)
            throws SaldoInsuficienteException {
        banco.sacar(valor, conta);
    }

    public void depositar(BigDecimal valor, Conta conta) {
        try {
			banco.depositar(valor, conta);
		} catch (OperacaoInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public BigDecimal consultarSaldo(Conta conta) {
        return banco.consultarSaldo(conta);
    }

    public List<Lancamento> consultaExtrato(Conta conta, LocalDate dataInicio,
            LocalDate dataFim) {
        return banco.consultaExtrato(conta, dataInicio, dataFim);
    }

    public void transferirValor(BigDecimal valorATransferir,
            Conta contaDestino, Conta conta)
            throws TransferenciaInvalidaException, SaldoInsuficienteException {
        banco.transferirValor(valorATransferir, contaDestino, conta);

    }

}
