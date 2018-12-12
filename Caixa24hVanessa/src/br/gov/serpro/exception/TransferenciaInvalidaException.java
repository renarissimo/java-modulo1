package br.gov.serpro.exception;

public class TransferenciaInvalidaException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TransferenciaInvalidaException() {
		super("Não é possivel realizar transferencia para a mesma conta");
	}
	

}
