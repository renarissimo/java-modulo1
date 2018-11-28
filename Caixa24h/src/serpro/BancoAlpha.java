package serpro;

import java.util.ArrayList;
import java.util.List;

import serpro.SaldoInsuficienteException;

public class BancoAlpha implements Operacoes {

	private double Saque = 0.0;
	private double Deposito = 0.0;
	private double Saldo = 0.0;
	private static final Double Limite = -850.00;
	List<Operacoes_Correntes> Operacoes = new ArrayList<Operacoes_Correntes>();

	private int banco;
	private String agencia;
	

	public BancoAlpha(int banco, String agencia) {
		super();
		this.banco = banco;
		this.agencia = agencia;
	}

	@Override
	public void realizarDeposito(double valorDeposito) {
		Saldo += valorDeposito;
		//Operacoes.add("Depósito no valor de: ", getValorDeposito());
	}

	@Override
	public void realizarSaque(double valorSaque) throws SaldoInsuficienteException {		
		if ((Saldo -= valorSaque) >= Limite) {
			Saldo -= valorSaque;
		} else {
			throw new SaldoInsuficienteException();
		}
	}

	@Override
	public List consultarExtrato() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double obterSaldo() {
		return Saldo;
	}

	@Override
	public void realizarTransferencia(int banco, String agencia, double valorTransferencia) throws BancoDiferenteException {
		/*if ((Saldo -= valorSaque) >= Limite) {
			Saldo -= valorSaque;
		} else {*/
			throw new BancoDiferenteException();
		/*}*/

	}
	
	public double getValorDeposito() {
   	 return Deposito;
   	 }

}
