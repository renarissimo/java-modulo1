package serpro;

import java.util.List;

public interface Banco {
			
	//Consultar extrato	
	List consultarExtrato(); 		
	
	//Consultar Saldo
	Double obterSaldo();	
	
	//Realizar Transferência (no mesmo banco)
	void realizarTransferencia(int banco, String  agencia, double valorTransferencia);
	
	//Realizar Depósito
	void realizarDeposito(double valorDeposito);
	
	//Saque
	void realizarSaque(double valorSaque);

}
