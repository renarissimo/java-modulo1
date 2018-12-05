package br.gov.serpro.caixa24h;

import java.math.BigDecimal;
import java.util.List;

import br.gov.serpro.principal.Banco;
import br.gov.serpro.principal.ContaCorrente;
import br.gov.serpro.principal.Operacao;
import br.gov.serpro.principal.Transferencia;
import br.gov.serpro.principal.SaldoInsuficienteExcpetion;

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
	public List<Operacao> consultarExtrato(ContaCorrente contaCorrente) {
		return banco.consultarExtrato(contaCorrente);
	}

	/**
	 * Obter Extrato	
	 * @param operacao
	 * @return
	 */
	public Double obterSaldo(ContaCorrente contaCorrente) {
		return banco.obterSaldo(contaCorrente);
	}

	/**
	 * Realizar Transferencia	
	 * @param operacao
	 * @return
	 */
	public void realizarTransferencia(Transferencia transferencia) throws SaldoInsuficienteExcpetion {		
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
	public void realizarSaque(ContaCorrente operacao, BigDecimal valorSaque) throws SaldoInsuficienteExcpetion{
			banco.realizarSaque(operacao, valorSaque);	
	}

}
