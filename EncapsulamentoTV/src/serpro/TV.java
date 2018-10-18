package serpro;

import java.util.Arrays;
import java.util.List;

public class TV {

	private int volumeMinimo = 0;
	private int volumeMaximo = 50;
	// private List<Integer> canal = Arrays.asList(2,4,5,7,9,11,13);
	private List<Integer> canal;
	private boolean ligado = false;
	private int canalAtivo;
	private int volume = 0;

	public TV(List<Integer> canal) {
		super();
		this.canal = canal;
	}

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
	 * public void canaisPossiveis() { for (int x = 0; x < canal.size(); x++) {
	 * System.out.println("Canais Poss�veis = "+ canal.get(x).getCanal());
	 * 
	 * } }
	 */

	public boolean ligarDesligar(String acao) {
		if (acao.equals("ligar")) {

			if (ligado == false) {
				ligado = true;
				canalAtivo = canal.get(0); // Primeira posição da lista.
				volume = 10;
			} else {
				ligado = false;
			}
			return ligado;
		} else {
			return ligado;
		}
	}
	

	public void diminuirVolume() {
		volume -= 10;
		if (volume > getVolumeMinimo()) {
			volume = 0;			
		}		
	}
	
	private int getVolumeMinimo() {
		return volumeMinimo;
	}
	

	public void aumentarVolume() {
		volume += 10;
		if (volume > getVolumeMaximo()) {
			volume = 50;			
		}		
	}

	private int getVolumeMaximo() {
		return volumeMaximo;
	}
	
	public int getVolumeAtual() {
		return volume;
	}
	
	public int getcanalAtivo() {
		return canalAtivo;
	}
}
