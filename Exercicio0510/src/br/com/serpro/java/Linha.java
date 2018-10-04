package br.com.serpro.java;

public enum Linha {

	SOLIDO("SOLIDO"),
	TRANCEJADO("TRACEJADO"),
	PONTILHADO("PONTILHADO"),
	TRANCEJADO_DUPLO("TRACEJADO_DUPLO"),
	TRANCEJADO_ESPACO("TRACEJADO_ESPACO");
	
	private String linha;
	
	Linha(String linha) {
	     this.linha = linha;
	}

    public String getlinha() {
          return linha;	

    }
}