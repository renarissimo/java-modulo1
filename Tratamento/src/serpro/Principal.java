package serpro;

public class Principal {		
	
	public static void tratamento(Autoridade autoridade) {		
		autoridade.getTratamento();
	}		
		
	public static void main(String[] args) { 
		
		ComTitulo ct1 = new ComTitulo("Dr.");
		Autoridade aut1 = new Autoridade("Renato","Verissimo",ct1);
		
		Respeitoso ct2 = new Respeitoso("M");
		Autoridade aut2 = new Autoridade("Jose","Verissimo",ct2);
		
		System.out.println("Aut 1 = " + aut1.getTratamento());
		System.out.println("Aut 2 = " + aut2.getTratamento());
    }		    	 			
}		
