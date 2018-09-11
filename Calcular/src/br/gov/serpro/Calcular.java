package br.gov.serpro;

public class Calcular {
	int primeiro;
	int segundo;
	
	public Calcular (int primeiro, int segundo) {		
		this.primeiro = primeiro;
		this.segundo = segundo;
	}
	
	public Calcular (int primeiro)  {
		this.primeiro = primeiro;
	}
	
	double retornarMaior() {		
		if (primeiro > segundo) return primeiro;
		return segundo;		
	}
	
	double retornarAleatorio() {			
		 return Math.floor(Math.random() * (segundo - primeiro)) + primeiro;
	}
	
	double retornarFahrenheit(){
		  return (9 * (primeiro / 5) + 32);
	}
	
	void imprimir() {
	System.out.println("Maior = " + retornarMaior() + " Aleatório = " + retornarAleatorio());
	}
	
	void imprimirTemperatura() {
		System.out.println("Temperatura em  Fahrenheit = " + retornarFahrenheit());
	}	
}