package br.gov.serpro.curso;
import java.util.Date;

public class Pedido {
	private Date data;
	private String status;

	public Pedido(Date data, String status) {
		this.data = data;
		this.status = status;
           
	}
	
	public double calcTax() {
		return 0.5;
	}
	
	public double calcTotal() {
		return 6.5;
	}
	
	public double calcTotalPeso() {
		return 1.5;
	}		
}