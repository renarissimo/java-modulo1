package serpro;

import java.util.List;

public abstract class Contribuinte {
    String nome;    
    int ni;
    double renda;
    
	public Contribuinte(String nome, int ni, double renda) {
		super();
		this.nome = nome;
		this.ni = ni;
		this.renda = renda;
	}
    
	public abstract double calcularImposto(List Contribuinte);
    
}
