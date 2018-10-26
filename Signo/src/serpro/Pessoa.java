package serpro;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pessoa {
	
	private LocalDate dataDeNascimneto; 
	
	public Pessoa(LocalDate dataDeNascimneto) {
		this.dataDeNascimneto = dataDeNascimneto;		
	}
	
    public int getIdade() {
    	LocalDateTime now = LocalDateTime.now();
    	return (now.getYear() - dataDeNascimneto.getYear());
    }
	
	/*
    public String getSigno(LocalDate dataDeNascimneto) {
		return 
	}
	*/
}
