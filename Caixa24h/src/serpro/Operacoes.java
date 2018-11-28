package serpro;

import java.util.List;

public interface Operacoes {
			
	//Consultar extrato	
	List consultarExtrato(); 		
	
	//Consultar Saldo
	Double obterSaldo();	
	
	//Realizar Transfer�ncia (no mesmo banco)
	void realizarTransferencia(int banco, String  agencia, double valorTransferencia) throws BancoDiferenteException;
	
	//Realizar Dep�sito
	void realizarDeposito(double valorDeposito);
	
	//Saque
	void realizarSaque(double valorSaque) throws SaldoInsuficienteException;

}
