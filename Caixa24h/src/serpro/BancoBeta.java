package serpro;

import java.util.List;

public class BancoBeta implements Banco {
	
	private int conta;
	private String agencia;
	private Double saldo;
	
		
	public BancoBeta(String agencia,int banco) {
		super();
		this.agencia = agencia;
		this.conta = banco;
	}

	@Override
	public List consultarExtrato() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double obterSaldo() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public void realizarTransferencia(int banco, String agencia, double valorTransferencia){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void realizarDeposito(double valorDeposito) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void realizarSaque(double valorSaque){
		// TODO Auto-generated method stub
		
	}

	public Double ObterSaldo() {
		//return saldo;
		return 0.0;
	}
		

}
