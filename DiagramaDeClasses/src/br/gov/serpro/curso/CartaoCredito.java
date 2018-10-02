package br.gov.serpro.curso;
import java.util.Date;
//
public class CartaoCredito extends Pagamento {
		    
	private int numero;
	private String tipo;
	Date dataExp;
	
	public CartaoCredito(int numero, String tipo, Date dataExp) {
		this.numero = numero;
		this.tipo = tipo;
		this.dataExp = dataExp;		
	}
	
	public boolean isAutorizado() {
		return true;
	}		
}