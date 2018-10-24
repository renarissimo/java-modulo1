package serpro;

public class Som implements Controlavel {

	String acao;
	
	public Som(String acao) {
		this.acao = acao;
	}
	
			
	public String getAcao (String acao) {
		return acao;
	}

	@Override
	public void ligar() {
		System.out.println("Som ligado");
		
	}

	@Override
	public void desligar() {
		System.out.println("Som desligado");
		
	}

	
	
}
