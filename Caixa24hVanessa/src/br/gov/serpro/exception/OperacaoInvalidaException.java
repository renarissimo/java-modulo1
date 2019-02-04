package br.gov.serpro.exception;

public class OperacaoInvalidaException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public OperacaoInvalidaException() {
		super("Operacao Invalida para este Banco");
	}

}

