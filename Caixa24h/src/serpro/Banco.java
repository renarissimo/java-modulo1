package serpro;

import java.util.List;

public interface Banco {
			
	//Consultar extrato	
	List consultarExtrato(Operacao operacao); 		
	
	//Consultar Saldo
	Double obterSaldo(Operacao operacao);	
	
	//Realizar Transfer�ncia (no mesmo banco)
	void realizarTransferencia(Transferencia transferencia);
	
	//Realizar Dep�sito
	void realizarDeposito(Operacao operacao, double valorDeposito);
	
	//Saque
	void realizarSaque(Operacao operacao, double valorSaque);

}
