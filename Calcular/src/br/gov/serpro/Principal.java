package br.gov.serpro;

public class Principal {

	public static void main(String[] args) {
        Calcular calcular = new Calcular(1,4);
		
		calcular.retornarMaior();
		calcular.retornarAleatorio();
		calcular.imprimir();
		
		Calcular calcular1 = new Calcular(25);
		
		calcular1.retornarFahrenheit();
		calcular1.imprimirTemperatura();
		//versionamento GIT

	}

}
