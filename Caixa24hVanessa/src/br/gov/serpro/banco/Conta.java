package br.gov.serpro.banco;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.gov.serpro.exception.OperacaoInvalidaException;

/**
 * Classe abstrata que representa a entidade Conta e contem m�todos de
 * manipula��o da mesma.
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
     * M�todo b�sico de retorno de saldo.
     * 
     * @return o saldo da conta
     */
    public BigDecimal getSaldo() {
        return this.saldo;
    }

    /**
     * M�todo b�sico de retorno do identificador da conta.
     * 
     * @return o identificador da conta
     */
    public String getIdConta() {
        return this.idConta;
    }

    /**
     * M�todo a ser implementado de acordo com as regras definidas por cada
     * banco.
     * 
     * @return Limite da conta
     */

    public abstract BigDecimal getLimite();

    /**
     * M�todo que atualiza o saldo da conta e registra os lan�amentos na conta,
     * ou seja, adiciona os lancamentos em uma lista. Deve ser acionado sempre
     * que houver uma operacao de atualizacao de valores do saldo.
     * 
     * @param lancamento
     *            Lancamento � um objeto do tipo lan�amento composto por
     *            descri��o do lan�amento, data do lan�amento e valor. O valor
     *            dever� ser positivo para creditos na conta e negativos para
     *            d�bitos na conta.
     */
    //alterado de protect para public
    public void registrarLancamento(Lancamento lancamento) {        
        saldo = saldo.add(lancamento.valor);
        lancamentos.add(lancamento);
    }

    /**
     * M�todo que deve retornar a lista de lan�amentos realizadas na conta em um
     * dado per�odo.
     * 
     * @param dataInicial
     * @param dataFinal
     * @return lista de lan�amentos
     */
    /*
    protected abstract List<Lancamento> consultaLancamento( alterado por Renato 
     */    
    public abstract List<Lancamento> consultaLancamento(
            LocalDate dataInicial, LocalDate dataFinal);
    
    /**
     * Método criado por Renato para operação inválida.
     * 
     * @throws OperacaoInvalidaException
     */
     public abstract void verificarQuantidade (Conta conta, LocalDate date)
     		throws OperacaoInvalidaException;
      
}
