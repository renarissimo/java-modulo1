package br.com.serpro.heranca;
import java.time.LocalDate;
import java.time.ZoneId;

public class DebitoAINL extends Debito {
		
	double valorBruto;
	double valorAlocado;
	LocalDate dataVencimento;
	

	public DebitoAINL(String tipoNi, int NumeroNi) {
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
				
		LocalDate localdate1 = LocalDate.now(ZoneId.of("GMT+02:30"));
					     				
		if (localdate1.isAfter(dataVencimento) == true) {
		    return (valorBruto - (valorAlocado * 2));
		}else {
			return (valorBruto - valorAlocado);
		}	
		
	}	  	
}
