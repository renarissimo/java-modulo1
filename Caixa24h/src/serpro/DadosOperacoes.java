package serpro;

import java.math.BigDecimal;

public class DadosOperacoes {
	
	final private String operacao;
	final private BigDecimal valorTransacao;
	
	protected DadosOperacoes(String operacao, BigDecimal valorTransacao) {
		super();
		this.operacao = operacao;
		this.valorTransacao = valorTransacao;
	}

	public String getOperacao() {
		return operacao;
	}

	public BigDecimal getValorTransacao() {
		return valorTransacao;
	}
	

	
}
