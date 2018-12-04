package br.gov.serpro.caixa24h;

import java.math.BigDecimal;
import java.util.List;

import br.gov.serpro.principal.Banco;
import br.gov.serpro.principal.ContaCorrente;
import br.gov.serpro.principal.DadosOperacoes;
import br.gov.serpro.principal.DadosTransferencia;
import br.gov.serpro.principal.ExcpetionSaldoInsuficiente;

public class Caixa24h {

	private Banco banco;
    
	public Caixa24h(Banco banco) {
		super();
		this.banco = banco;
	}

	/**
	 * Consultar Extrato	
	 * @param operacao
	 * @return
	 */
	public List<DadosOperacoes> consultarExtrato(ContaCorrente operacao) {
		return banco.consultarExtrato(operacao);
	}

	/**
	 * Obter Extrato	
	 * @param operacao
	 * @return
	 */
	public Double obterSaldo(ContaCorrente operacao) {
		return banco.obterSaldo(operacao);
	}

	/**
	 * Realizar Transferencia	
	 * @param operacao
	 * @return
	 */
	public void realizarTransferencia(DadosTransferencia transferencia) {
		banco.realizarTransferencia(transferencia);
	}

	/**
	 * Realizar Depósito	
	 * @param operacao
	 * @return
	 */
	public void realizarDeposito(ContaCorrente operacao, BigDecimal valorDeposito) {
		banco.realizarDeposito(operacao, valorDeposito);
	}

	/**
	 * Realizar Saque	
	 * @param operacao
	 * @return
	 */
	public void realizarSaque(ContaCorrente operacao, BigDecimal valorSaque) {
		try {
			banco.realizarSaque(operacao, valorSaque);
		} catch (ExcpetionSaldoInsuficiente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
