package br.gov.serpro.banco;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.gov.serpro.exception.OperacaoInvalidaException;
import br.gov.serpro.exception.SaldoInsuficienteException;
import br.gov.serpro.exception.TransferenciaInvalidaException;

/**
 * Classe abstrata que representa a entidade Banco e contem m�todos que devem
 * ser implementados para construcao da interacao como Caixa24h.
 */
public abstract class Banco {
    /* Atributos minimos requeridos para identificacao do banco */
    private String nome;
    private Long numero;

    public String getNome() {
        return nome;
    }

    public Long getNumero() {
        return numero;
    }

    public Banco(String nome, Long numero) {
        this.nome = nome;
        this.numero = numero;
    }

    /**
     * M�todo que deve registrar e efetuar o saque em uma conta
     * 
     * @param valor
     * @param conta
     * @throws SaldoInsuficienteException
     */
    public abstract void sacar(BigDecimal valor, Conta conta)
            throws SaldoInsuficienteException;

    /**
     * M�todo que deve registrar e efetuar o deposito em uma conta
     * 
     * @param valor
     * @param conta
     * @throws OperacaoInvalidaException 
     */
    public abstract void depositar(BigDecimal valor, Conta conta) throws OperacaoInvalidaException;

    /**
     * M�todo que deve consultar o saldo em uma conta
     * 
     * @param conta
     * @return
     */
    public abstract BigDecimal consultarSaldo(Conta conta);

    /**
     * M�todo que deve consultar os lancamentos realizados em uma conta
     * 
     * @param conta
     * @param dataInicio
     * @param dataFim
     * @return lista de lanc�amentos da conta
     */
    public abstract List<Lancamento> consultaExtrato(Conta conta,
            LocalDate dataInicio, LocalDate dataFim);

    /**
     * M�todo que deve registrar e transferir valores entres contas
     * 
     * @param valorATransferir
     * @param contaDestino
     * @param conta
     * @throws TransferenciaInvalidaException
     */
    public abstract void transferirValor(BigDecimal valorATransferir,
            Conta contaDestino, Conta conta)
            throws TransferenciaInvalidaException,SaldoInsuficienteException;
    
   

}
