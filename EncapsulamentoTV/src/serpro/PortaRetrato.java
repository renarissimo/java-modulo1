package serpro;

import java.util.List;

public class PortaRetrato implements ControlavelSom{
	
	private int volumeMinimo = 0;
	private int volumeMaximo = 100;
	private List<Integer> fotos;
	private boolean ligado = false;
	private int sequencialFotos;
	private int volume = 0;
	
	
	@Override
	public boolean ligarDesligar(String acao) {
		if (acao.equals("ligar")) {

			if (ligado == false) {
				ligado = true;
				sequencialFotos = fotos.get(0); // Primeira posição da lista.
				volume = 10;
			} else {
				ligado = false;
			}
			return ligado;
		} else {
			return ligado;
		}
	}

	@Override
	public void diminuirVolume() {
		volume -= 10;
		if (volume > getVolumeMinimo()) {
			volume = 0;			
		}		
	}
	
	private int getVolumeMinimo() {
		return volumeMinimo;
	}
	
	@Override
	public void aumentarVolume() {
		volume += 10;
		if (volume > getVolumeMaximo()) {
			volume = 100;			
		}		
	}

	private int getVolumeMaximo() {
		return volumeMaximo;
	}
			
}
