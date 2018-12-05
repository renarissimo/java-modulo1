package br.gov.serpro.principal;

public class Transferencia {
	
	
	final private ContaCorrente contaCorrenteOrigem;
	final private ContaCorrente contaCorrenteDestino;		
	final private double ValorTransferencia;
	
	public Transferencia(ContaCorrente contaCorrenteOrigem, ContaCorrente contaCorrenteDestino,
			double valorTransferencia) {
		super();
		this.contaCorrenteOrigem = contaCorrenteOrigem;
		this.contaCorrenteDestino = contaCorrenteDestino;
		ValorTransferencia = valorTransferencia;
	}

	public ContaCorrente getContaCorrenteOrigem() {
		return contaCorrenteOrigem;
	}

	public ContaCorrente getContaCorrenteDestino() {
		return contaCorrenteDestino;
	}

	public double getValorTransferencia() {
		return ValorTransferencia;
	}
	
	
	
	
	
	
	

}
