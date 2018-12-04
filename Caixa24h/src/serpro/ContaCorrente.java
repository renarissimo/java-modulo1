package serpro;

public class ContaCorrente {
	final private String agencia;
	final private int conta;
	
	public ContaCorrente(String agencia, int conta) {
		super();
		this.agencia = agencia;
		this.conta = conta;
	}

	public String getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}
	
	
	
}
