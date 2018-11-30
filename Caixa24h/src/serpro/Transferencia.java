package serpro;

public class Transferencia {
	
	
	String agenciaOrigem;
	int contaOrigem;
	String agenciaDestino;
	int contaDestino;	
	double ValorTransferencia;
	public Transferencia(String agenciaOrigem, int contaOrigem, String agenciaDestino, int contaDestino,
			double valorTransferencia) {
		super();
		this.agenciaOrigem = agenciaOrigem;
		this.contaOrigem = contaOrigem;
		this.agenciaDestino = agenciaDestino;
		this.contaDestino = contaDestino;
		ValorTransferencia = valorTransferencia;
	}
	
	
	

}
