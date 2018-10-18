import java.util.Arrays;
import java.util.List;



public class TV {
	
	private int volumeMinimo;
	private int volumeMaximo;	
	private List<Integer> canal = Arrays.asList(2,4,5,7,9,11,13);
	private boolean ligado = false;
	private int canalAtivo;
	
	       	
	protected boolean verificarCanalAtivo(Integer valor) {
		
		for (int x = 0; x < canal.size(); x++) {				
		    if (canal.get(x) == valor) {
		    	canalAtivo = valor;
		    	return true;		    	
		    }
		}
		    return false;
	}
	
	/*
	public void canaisPossiveis() {
		for (int x = 0; x < canal.size(); x++) {				
		  System.out.println("Canais Possíveis = "+ canal.get(x).getCanal()); 
		    	
		    }
		}*/
	
	public boolean ligarDesligar (String acao) {
		if (acao.equals("ligar")) {			
			
			if (ligado == false) {
				ligado = true;
				canalAtivo = 2;
			}else {
				ligado = false;
			}
			return ligado;	
		}else{		  
		    return ligado;		    	
		}		    		
	}
	
	public int getVolumeMinimo() {
	      return volumeMinimo;
	    }    
	     
	public void setVolumeMinimo(int volumeMinimo) {
	   if (this.volumeMinimo <= 0) {
	 	  volumeMinimo = 00;
	      System.out.println("Alteração não permitida");	  
	    }
	 }	
	 
    public int getVolumeMaximo() {
      return volumeMaximo;
    }    
     
    public void setVolumeMaximo(int volumeMaximo) {
      if (this.volumeMaximo > 50) {
    	  volumeMaximo = 50;
       System.out.println("Alteração não permitida");	  
      }
    }       
}
