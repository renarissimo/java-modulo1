public class ControleRemoto {
	
	TV tv1 = new TV();
	
	public boolean mudarCanal(int canal) {	
		return tv1.verificarCanalAtivo(canal); 				
	}

	public boolean ligarTV() {	    
	    return tv1.ligarDesligar("ligar");
	}
	
	public boolean desligarTV() {	    
		return tv1.ligarDesligar("desligar");
	}

    public boolean aumentarVolume () {
    	int volume = 0;
    	volume += 10;
    if (volume > tv1.getVolumeMaximo())  {
    	return false;
    }
        return true;
    }	
    
    public boolean diminuirVolume () {
    	int volume = 0;
    	volume -= 10;
    if (volume > tv1.getVolumeMinimo())  {
    	return false;
    }
        return true;
    }

}
