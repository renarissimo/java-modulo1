package br.gov.serpro.curso;

public class Principal{

	public static void main(String[] args) {
	    Corrida corridaDaAmizade = new Corrida(2000);
            corridaDaAmizade.adicionaCarro(new CarrosSoma("CarroA",10,110));
            corridaDaAmizade.adicionaCarro(new CarrosSoma("CarroB",8,130));
            corridaDaAmizade.adicionaCarro(new CarrosSoma("CarroC",1.7,100));
            corridaDaAmizade.adicionaCarro(new CarrosSoma("CarroD",1.4,150));
            corridaDaAmizade.umDoisTresEJa();
        }
}
