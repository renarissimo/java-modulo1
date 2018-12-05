package br.gov.serpro.principal;

import java.math.BigDecimal;
import java.util.List;

public interface Banco {
			
	/**
	 * Consultar Extrato	
	 * @param operacao
	 * @return
	 */
	List<Operacao> consultarExtrato(ContaCorrente operacao); 		
	
	/**
	 * Obter Saldo
	 * @param operacao
	 * @return
	 */
	Double obterSaldo(ContaCorrente operacao);
	
	/**
	 * Realizar Transferência
	 * @param transferencia
	 */
		
	void realizarTransferencia(Transferencia transferencia)throws SaldoInsuficienteExcpetion;
	
	/***
	 * Realizar Depóstito
	 * @param operacao
	 * @param valorDeposito
	 */
	void realizarDeposito(ContaCorrente operacao, BigDecimal valorDeposito);
	
	/**
	 * Realizar Saque
	 * @param operacao
	 * @param BigDecimal
	 */
	void realizarSaque(ContaCorrente operacao, BigDecimal valorSaque) throws SaldoInsuficienteExcpetion;

}
