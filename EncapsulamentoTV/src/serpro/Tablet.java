package serpro;

public class Tablet implements Controlavel{
	
	boolean ligado;
	private int volume = 0;

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
