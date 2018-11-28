package serpro;

import java.util.List;

public class BancoBeta implements Operacoes {
	
	private int banco;
	private String agencia;
	
		
	public BancoBeta(int banco, String agencia) {
		super();
		this.banco = banco;
		this.agencia = agencia;
	}

	@Override
	public List consultarExtrato() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double obterSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void realizarTransferencia(int banco, String agencia, double valorTransferencia)
			throws BancoDiferenteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void realizarDeposito(double valorDeposito) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void realizarSaque(double valorSaque) throws SaldoInsuficienteException {
		// TODO Auto-generated method stub
		
	}


	
	

}
