package serpro;


import java.util.List;

public class BancoAlpha implements Banco {

	private String agencia;
	private int conta;
	
	
	public BancoAlpha(String agencia, int banco) {
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
	
}
