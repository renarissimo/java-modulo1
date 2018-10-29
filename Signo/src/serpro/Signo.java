package serpro;

import java.time.LocalDate;

public class Signo {
	
	private LocalDate dataDeNascimento; 

	public Signo(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
			
	String descobrirSigno () {
	    
	    if (dataDeNascimento.isAfter('03-21') & dataDeNascimento.isBefore('04-20')) {
	    	return ("Aries");
	    } else if 
	       (dataDeNascimento.isAfter('04-21') & dataDeNascimento.isBefore('05-20')){
	    	return ("Touro");	
	    } else if
	       (dataDeNascimento.isAfter('05-21') & dataDeNascimento.isBefore('06-20')){
	    	return ("Gemeos");	    	
	    } else if
	       (dataDeNascimento.isAfter('06-21') & dataDeNascimento.isBefore('07-21')){
	    	return ("Câncer");
	    } else if
	       (dataDeNascimento.isAfter('07-21') & dataDeNascimento.isBefore('08-22')){
	    	return ("Leão");
	    } else if
	       (dataDeNascimento.isAfter('08-22') & dataDeNascimento.isBefore('09-23')){
	    	return ("Virgem");
	    } else if
	       (dataDeNascimento.isAfter('09-23') & dataDeNascimento.isBefore('10-22')){
	    	return ("Libra");
	    } else if
	       (dataDeNascimento.isAfter('10-23') & dataDeNascimento.isBefore('11-21')){
	    	return ("Escorpião");
	    } else if
	       (dataDeNascimento.isAfter('11-22') & dataDeNascimento.isBefore('12-21')){
	    	return ("Sagitário");	
	    } else if
	       (dataDeNascimento.isAfter('12-22') & dataDeNascimento.isBefore('01-21')){
	    	return ("Capricórnio");	
	    } else if
	       (dataDeNascimento.isAfter('01-22') & dataDeNascimento.isBefore('02-19')){
	    	return ("Aquário");
	    } else if
	       (dataDeNascimento.isAfter('02-20') & dataDeNascimento.isBefore('03-20')){
	    	return ("Peixes");	
	    }
      }
}	
