package serpro;

public class Tablet implements Controlavel{
	
	boolean ligado;

	public Tablet() {
		// TODO Auto-generated constructor stub
	}
		
	@Override
	public boolean ligarDesligar(String acao) {
		if (acao.equals("ligar")) {

			if (ligado == false) {
				ligado = true;				
			} else {
				ligado = false;
			}
			return ligado;
		} else {
			return ligado;
		}
	}
		
	
}	
