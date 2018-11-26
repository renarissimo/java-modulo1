package serpro;

import java.util.List;

public interface Operacoes {
			
	//Consultar extrato	
	List consultarExtrato(); 		
	
	//Consultar Saldo
	Double obterSaldo();	
	
	//Realizar Transferência (no mesmo banco)
	void realizarTransferencia(double valorTransferencia);
	
	//Realizar Depósito
	void realizarDeposito(double valorDeposito);
	
	//Saque
	void realizarSaque(double valorSaque) throws SaldoInsuficiente;

}
