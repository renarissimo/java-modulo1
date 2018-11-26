package serpro;

import java.util.ArrayList;
import java.util.List;

import serpro.SaldoInsuficiente;

public class BancoAlpha implements Operacoes {

	private double Saque = 0.0;
	private double Deposito = 0.0;
	private double Saldo = 0.0;
	private static final Double Limite = -850.00;
	List<Operacoes_Correntes> Operacoes = new ArrayList<Operacoes_Correntes>();

	/*
	public BancoAlpha(double Saque, double Deposito) {
		super();
		this.Saque = Saque;
		this.Deposito = Deposito;
	}
*/
	@Override
	public void realizarDeposito(double valorDeposito) {
		Saldo += valorDeposito;
		//Operacoes.add("Depósito no valor de: ", getValorDeposito());
	}

	@Override
	public void realizarSaque(double valorSaque) throws SaldoInsuficiente {
		if ((Saldo -= valorSaque) >= Limite) {
			Saldo -= valorSaque;
		} else {
			throw new SaldoInsuficiente();
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
	public void realizarTransferencia(double valorTransferencia) {
		// TODO Auto-generated method stub

	}
	
	public double getValorDeposito() {
   	 return Deposito;
   	 }

}
