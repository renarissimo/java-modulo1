package serpro.gov.br;

public class Pizza {	
	String sabor;
	
	public Pizza (String sabor) {		
		this.sabor = sabor;
	}
	
	double calcularPreco() {
		double preco = 0.0;
		if (sabor == "Portuguesa") preco = 40.00;		
		else if (sabor == "Mussarela") preco =  35.00;	   
		else if (sabor == "Marguerita") preco = 42.00;
		else if (sabor == "Quatro Queijos") preco = 45.00;
		else if (sabor == "Calabresa") preco = 37.00;
		return preco;
	}

}
