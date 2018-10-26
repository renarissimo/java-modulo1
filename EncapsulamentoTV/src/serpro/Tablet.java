package serpro;

import java.util.List;

public class Tablet implements ControlavelTablet{
	
	private List<String> aplicativo;		
	boolean ligado;	

	public Tablet() {		
			super();
			this.aplicativo = aplicativo;		
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

	@Override	
	public boolean navegarAplicativo(String app)	 {

			for (int x = 0; x < aplicativo.size(); x++) {
				if (aplicativo.get(x).equals(app)) {					
					return true;
				}
			}
			return false;
		}	
				
	}