package br.gov.serpro.banco;

import java.math.BigDecimal;
import java.util.Date;

public class Lancamento {
    String descricao;
    BigDecimal valor;
    Date data;

    public Lancamento(String descricao, BigDecimal valor, Date data) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

}
