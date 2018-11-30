package serpro;

import java.util.List;

public class BancoBeta implements Banco {
	
	Operacao operacao;

	public BancoBeta(Operacao operacao) {
		super();
		this.operacao = operacao;
	}
		

	@Override
	public List consultarExtrato(Operacao operacao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double obterSaldo(Operacao operacao) {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public void realizarTransferencia(Transferencia transferencia){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void realizarDeposito(Operacao operacao, double valorDeposito) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void realizarSaque(Operacao operacao, double valorSaque){
		// TODO Auto-generated method stub
		
	}

	public Double ObterSaldo(Operacao operacao) {
		//return saldo;
		return 0.0;
	}
		

}
