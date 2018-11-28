package serpro;

import java.util.List;

public interface Operacoes {
			
	//Consultar extrato	
	List consultarExtrato(); 		
	
	//Consultar Saldo
	Double obterSaldo();	
	
	//Realizar Transferência (no mesmo banco)
	void realizarTransferencia(int banco, String  agencia, double valorTransferencia) throws BancoDiferenteException;
	
	//Realizar Depósito
	void realizarDeposito(double valorDeposito);
	
	//Saque
	void realizarSaque(double valorSaque) throws SaldoInsuficienteException;

}
