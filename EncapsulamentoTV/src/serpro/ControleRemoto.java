package serpro;
public class ControleRemoto {
	
	TV tv1;
	
	
	public ControleRemoto(TV tv1) {
		super();
		this.tv1 = tv1;
	}

	public boolean mudarCanal(int canal) {	
		return tv1.verificarCanalAtivo(canal); 				
	}

	public boolean ligarTV() {	    
	    return tv1.ligarDesligar("ligar");
	}
	
	public boolean desligarTV() {	    
		return tv1.ligarDesligar("desligar");
	}

    public void aumentarVolume () {
    	tv1.aumentarVolume();
    }
    
    public void diminuirVolume () {
    	tv1.aumentarVolume();
    }	
       

}
