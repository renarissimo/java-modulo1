package serpro;

import java.util.List;

public class PessoaFisica extends Contribuinte{

	public PessoaFisica(String nome, int ni, double renda) {
		super(nome, ni, renda);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularImposto(List Contribuinte) {
		/*
		R$ 0,00 a R$ 2.000,00 0% 
R$ 2.000,01 a R$ 4.000,00 10%
R$ 4.000,01 a R$ 6.000,00 15%
R$ 6.000,01 a R$ 8.000,00 25%
R$ 8.000,01 ou mais 30%
  
		*/
		if (renda < 2000) { 
		return 0;
		}else if(renda < 4000) {
		return(renda * 1.1);	
		}
	}	
}

	 


	
	}

