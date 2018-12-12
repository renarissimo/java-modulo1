package br.gov.serpro.banco;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe abstrata que representa a entidade Conta e contem métodos de
 * manipulação da mesma.
 */

public abstract class Conta {

    private BigDecimal saldo;
    private String idConta;
    protected List<Lancamento> lancamentos = new ArrayList<>();

    public Conta(BigDecimal saldo, String idConta) {
        this.saldo = saldo;
        this.idConta = idConta;
    }

    /**
     * Método básico de retorno de saldo.
     * 
     * @return o saldo da conta
     */
    public BigDecimal getSaldo() {
        return this.saldo;
    }

    /**
     * Método básico de retorno do identificador da conta.
     * 
     * @return o identificador da conta
     */
    public String getIdConta() {
        return this.idConta;
    }

    /**
     * Método a ser implementado de acordo com as regras definidas por cada
     * banco.
     * 
     * @return Limite da conta
     */

    public abstract BigDecimal getLimite();

    /**
     * Método que atualiza o saldo da conta e registra os lançamentos na conta,
     * ou seja, adiciona os lancamentos em uma lista. Deve ser acionado sempre
     * que houver uma operacao de atualizacao de valores do saldo.
     * 
     * @param lancamento
     *            Lancamento é um objeto do tipo lançamento composto por
     *            descrição do lançamento, data do lançamento e valor. O valor
     *            deverá ser positivo para creditos na conta e negativos para
     *            débitos na conta.
     */
    protected void registrarLancamento(Lancamento lancamento) {
        saldo = saldo.add(lancamento.valor);
        lancamentos.add(lancamento);
    }

    /**
     * Método que deve retornar a lista de lançamentos realizadas na conta em um
     * dado período.
     * 
     * @param dataInicial
     * @param dataFinal
     * @return lista de lançamentos
     */
    protected abstract List<Lancamento> consultaLancamento(
            LocalDate dataInicial, LocalDate dataFinal);

}
