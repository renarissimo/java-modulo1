package br.gov.serpro.principal;

import java.math.BigDecimal;
import java.util.Date;

public class Operacao {
	
	final private String descricao;
	final private BigDecimal valorTransacao;
	final private Date data;
	
	protected Operacao(String descricao, BigDecimal valorTransacao, Date data) {
		super();
		this.descricao = descricao;
		this.valorTransacao = valorTransacao;
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public BigDecimal getValorTransacao() {
		return valorTransacao;
	}

	public Date getData() {
		return data;
	}
			

	
}
