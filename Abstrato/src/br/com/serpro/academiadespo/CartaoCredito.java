package br.com.serpro.academiadespo;

public class CartaoCredito extends Cartao{
	
	int codigoSeguranca;
	
	public String TipoPagto() {		
		return "A";
	}

	public String getTipoPagto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Validar() {
		// TODO Auto-generated method stub
		return null;
	}
			
	}
