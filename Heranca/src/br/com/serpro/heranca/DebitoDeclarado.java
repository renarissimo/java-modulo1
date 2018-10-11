package br.com.serpro.heranca;
import java.time.LocalDate;
import java.util.Date;

public class DebitoDeclarado extends Debito {
		
	double valorBruto;
	double valorAlocado;
	LocalDate dataVencimento;
	

	public DebitoDeclarado(String tipoNi, int NumeroNi) {
		super(tipoNi, NumeroNi);
		// TODO Auto-generated constructor stub
	}
	
	/*public DebitoAINL(double valorBruto, double valorAlocado, LocalDate dataVencimento) {
		this.valorBruto = valorBruto;
		this.valorAlocado = valorAlocado;
		this.dataVencimento = dataVencimento;
	}*/


	@Override
	public double calcularSaldo(double valorBruto, double valorAlocado,  LocalDate dataVencimento) {
				
		LocalDate localdate1 = LocalDate().now();
					     				
		if (localdate1.isAfter(dataVencimento) == true) {
		    return (valorBruto - (valorAlocado * 1.5));
		}else {
			return (valorBruto - valorAlocado);
		}	
		
	}	  	
}
