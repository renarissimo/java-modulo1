package serpro;

import java.util.List;

public class Caixa24h {

	Banco banco;
    
	public Caixa24h(Banco banco) {
		super();
		this.banco = banco;
	}

	// Consultar extrato
	public List consultarExtrato(Operacao operacao) {
		return banco.consultarExtrato(operacao);
	}

	// Consultar Saldo
	public Double obterSaldo(Operacao operacao) {
		return banco.obterSaldo(operacao);
	}

	// Realizar Transferência (no mesmo banco)
	public void realizarTransferencia(Transferencia transferencia) {
		banco.realizarTransferencia(transferencia);
	}

	// Realizar Depósito
	public void realizarDeposito(Operacao operacao, double valorDeposito) {
		banco.realizarDeposito(operacao, valorDeposito);
	}

	// Saque
	public void realizarSaque(Operacao operacao, double valorSaque) {
		banco.realizarSaque(operacao, valorSaque);
	}

}
