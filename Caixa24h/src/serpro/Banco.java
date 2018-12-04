package serpro;

import java.math.BigDecimal;
import java.util.List;

public interface Banco {
			
	/**
	 * Consultar Extrato	
	 * @param operacao
	 * @return
	 */
	List<DadosOperacoes> consultarExtrato(ContaCorrente operacao); 		
	
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
		
	void realizarTransferencia(DadosTransferencia transferencia);
	
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
	void realizarSaque(ContaCorrente operacao, BigDecimal valorSaque) throws ExcpetionSaldoInsuficiente;

}
