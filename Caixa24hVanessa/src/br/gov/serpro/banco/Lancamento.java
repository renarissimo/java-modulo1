package br.gov.serpro.banco;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class Lancamento {
    String descricao;
    BigDecimal valor;
    LocalDate data;

    public Lancamento(String descricao, BigDecimal valor, LocalDate data) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    // Criado por Renato
	public String getDescricao() {
		return descricao;
	}

	//Criado por Renato
	public BigDecimal getValor() {
		return valor;
	}

	//Criado por Renato
	public LocalDate getData() {
		return data;
	}
    
    
}
