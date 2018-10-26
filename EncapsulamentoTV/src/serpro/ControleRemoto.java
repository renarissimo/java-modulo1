package serpro;
public class ControleRemoto implements ControlavelSom{
			
	ControlavelSom ctrs1;
				
	public ControleRemoto(ControlavelSom ctrs1) {
	super();
	this.ctrs1 = ctrs1;	
	}
    		
	@Override
	public boolean ligarDesligar(String acao) {
		return ctrs1.ligarDesligar(acao);
	}


    @Override
    public void diminuirVolume() {
    	 ctrs1.diminuirVolume();	     
    }


    @Override
    public void aumentarVolume() {    	
    	ctrs1.aumentarVolume();
    }     
}
