package br.com.serpro.java;

public enum Cor {
	 
    VERMELHO("vermelho"),
	VERDE("verde"),
    AZUL("azul"),
    AMARELO("amarelo"),
    BRANCO("branco"),
    PRETO("preto"),
    LARANJA("laranja"),
    MARROM("marrom");
	    
    String cor;
 
    Cor(String cor) {
        this.cor = cor;
    }
 
    public String getcor() {
        return cor;
    }
}