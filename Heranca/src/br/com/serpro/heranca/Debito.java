package br.com.serpro.heranca;
import java.time.LocalDate;
import java.util.Date;

public abstract class Debito {
	
	protected String tipoNi;
	protected int NumeroNi;
	
	
	public Debito(String tipoNi, int NumeroNi) {		
		this.tipoNi = tipoNi;		
		this.NumeroNi = NumeroNi;		
	}		
		
	public String gettipoNi() {
		return tipoNi;
	}

	public int NumeroNi() {
		return NumeroNi;
	}

	public abstract double calcularSaldo(double valorBruto, double valorAlocado, LocalDate dataVencimento);
	
}
