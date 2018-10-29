package serpro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Pessoa {
	
	private LocalDate dataDeNascimento; 
	LocalDate now = LocalDate.now();
	
	public Pessoa(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;		
	}
	   
    
    boolean isMesMaior = dataDeNascimento.getMonthValue() >= now.getMonthValue();
    
    boolean isMesmoMesDiaMaior = dataDeNascimento.getMonthValue() >= now.getMonthValue()
            && dataDeNascimento.getDayOfMonth() >= now.getDayOfMonth();
            
    public int getIdade() {
        int y = 0;
    	if (isMesMaior || isMesmoMesDiaMaior) {
    		y = 1;
    	}    		
         return ((now.getYear() - dataDeNascimento.getYear()) - y);
    }            
	
 
    public String getSigno() {    	
    	if (dataDeNascimento.getMonthValue() == 3) {
    		if (dataDeNascimento.getDayOfMonth() >= 21) {
    			return ("Aries");
    		}else {
    			return("Peixes");
    		} 
    	}
    	/*if (dataDeNascimento.isAfter("03-21") & dataDeNascimento.isBefore("04-20")) {
	    	return ("Aries");
	    } else if 
	       (dataDeNascimento.isAfter("04-21") & dataDeNascimento.isBefore("05-20")){
	    	return ("Touro");	
	    } else if
	       (dataDeNascimento.isAfter("05-21") & dataDeNascimento.isBefore("06-20")){
	    	return ("Gemeos");	    	
	    } else if
	       (dataDeNascimento.isAfter("06-21") & dataDeNascimento.isBefore("07-21")){
	    	return ("Câncer");
	    } else if
	       (dataDeNascimento.isAfter("07-21") & dataDeNascimento.isBefore("08-22")){
	    	return ("Leão");
	    } else if
	       (dataDeNascimento.isAfter("08-22") & dataDeNascimento.isBefore("09-23")){
	    	return ("Virgem");
	    } else if
	       (dataDeNascimento.isAfter("09-23") & dataDeNascimento.isBefore("10-22")){
	    	return ("Libra");
	    } else if
	       (dataDeNascimento.isAfter("10-23") & dataDeNascimento.isBefore("11-21")){
	    	return ("Escorpião");
	    } else if
	       (dataDeNascimento.isAfter("11-22") & dataDeNascimento.isBefore("12-21")){
	    	return ("Sagitário");	
	    } else if
	       (dataDeNascimento.isAfter("12-22") & dataDeNascimento.isBefore("01-21")){
	    	return ("Capricórnio");	
	    } else if
	       (dataDeNascimento.isAfter("01-22") & dataDeNascimento.isBefore("02-19")){
	    	return ("Aquário");
	    } else if
	       (dataDeNascimento.isAfter("02-20") & dataDeNascimento.isBefore("03-20")){
	    	return ("Peixes");	
	    }*/
    }
