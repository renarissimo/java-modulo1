package serpro;
public class ControleRemoto implements ControlavelSom{
		
	TV tv1;
			
	/*public ControleRemoto(TV tv1) {
		super();
		this.tv1 = tv1;
	}*/
	
	public ControleRemoto(TV tv1) {
	super();
	this.tv1 = tv1;	
	}
    		
	@Override
	public boolean ligarDesligar(String acao) {
		return tv1.ligarDesligar(acao);
	}


    @Override
    public void diminuirVolume() {
	     tv1.diminuirVolume();
    }


    @Override
    public void aumentarVolume() {
    	tv1.aumentarVolume();	
    }     
}
